package org.sunjian.graphdatabaseservice.controller;


import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.neo4j.driver.internal.InternalPath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.sunjian.graphdatabaseservice.dao.BelongToRepository;
import org.sunjian.graphdatabaseservice.po.common.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

@RestController
public class RelationController {

    @Autowired
    BelongToRepository belongToRepository;

    @GetMapping("/relation/rlpersontostock")
    @ApiOperation(value = "查询关系人和股票之间的关系")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "rlperson_rlpname", dataType = "String", paramType = "query", required = false),
            @ApiImplicitParam(name = "rlperson_asharemame", dataType = "String", paramType = "query", required = false)
    })
    public Object getRelstionBetweenRelationPersonAndStock(@RequestParam(value = "rlperson_rlpname") String relationPersonName, @RequestParam(value = "rlperson_asharemame") String aShareName) {
        List<Map<String, Object>> relations = belongToRepository.searchRelationBetweenRelationPersonAndStock(relationPersonName, aShareName);

//        List<Map<String, Object>> relations = belongToRepository.searchAllNode();

        //dto fides
//        List<Node> nodeslist = new ArrayList<>();
//        List<Relationship>  relationshipslist =new ArrayList<>();
        List<InternalPath> path = new ArrayList<>();

        Paths returnPaths =new Paths();
        List<Path> listpaths=new ArrayList<>();
        relations.forEach(v -> {
            Path pathitem =new Path();
            List<Node> nodeslist = new ArrayList<>();
            List<Relationship>  relationshipslist =new ArrayList<>();

            for (String key : v.keySet()) {
                InternalPath item = (InternalPath) v.get(key);

                Iterable<org.neo4j.driver.v1.types.Node> nodesIterable = item.nodes();
                Iterable<org.neo4j.driver.v1.types.Relationship> relationshipIterable =item.relationships();
                Iterator<org.neo4j.driver.v1.types.Path.Segment> pathIterable=item.iterator();
                //build dto bean nodeslist
                nodesIterable.forEach(node -> {
                    Node nodeitem = new Node();
                    nodeitem.setId(node.id()); //set id

                    List<String> lablesitem = new ArrayList<>();
                    Iterable<String> lableIterable = node.labels();

                    lableIterable.forEach(ilables -> {
                        lablesitem.add(ilables);
                    });

                     nodeitem.setLabels(lablesitem); //set lablis
                     nodeitem.setProperties(node.asMap());//set properties
                     nodeslist.add(nodeitem);
                });

                //build dto bean relationshiplist
                relationshipIterable.forEach(relation->{
                    Relationship relationshipItem =new Relationship();
                    relationshipItem.setId(relation.id());
                    relationshipItem.setStart(relation.startNodeId());
                    relationshipItem.setEnd(relation.endNodeId());
                    relationshipItem.setType(relation.type());
                    relationshipItem.setProperties(relation.asMap());
                    relationshipslist.add(relationshipItem);
                });
            }

            pathitem.setNodes(nodeslist);
            pathitem.setRelationships(relationshipslist);
            pathitem.buildSegments();
            listpaths.add(pathitem);

        });

        returnPaths.setPaths(listpaths);

        return returnPaths;
    }
}
