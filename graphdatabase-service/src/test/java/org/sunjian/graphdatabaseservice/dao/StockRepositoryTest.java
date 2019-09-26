package org.sunjian.graphdatabaseservice.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.neo4j.ogm.model.Result;
import org.neo4j.ogm.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.sunjian.graphdatabaseservice.dao.extension.RepositoryExtension;
import org.sunjian.graphdatabaseservice.po.node.StockNode;
import org.sunjian.graphdatabaseservice.util.SpringUtil;

import java.util.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StockRepositoryTest {

    @Autowired
    StockRepository stockRepository;

    @Autowired
    BelongToRepository belongToRepository;

    @Autowired
    RepositoryExtension<StockNode> respositoryExtension;

    //     @Test
    public void Test() {
        List<StockNode> stockNodeList = stockRepository.getStockNodeByAShareShortName("棕榈股份");
        System.out.println(stockNodeList);
    }

    @Test
    public void StockByQueryNameTest() {
//         List<StockNode> stockNodeList=stockRepository.getStockNodeByQueryProperty("董事长","吴桂昌");
//         Session session =(Session) SpringUtil.getBean("Neo4jSession");
//         Map<String, String> params = new HashMap<>();
////         Result result =session.query("match (n:股票) where n.A股名称='601899' return n",params);
////         Iterable<StockNode> its = session.query(StockNode.class,"match (n:股票) where n.A股名称='601899' return n", params);
//         Result its = session.query("MATCH (v:`股票`) RETURN v LIMIT 25",params);
////         Iterator<StockNode> iterablelist=its.iterator();
//         List<StockNode> results = new ArrayList<>();
//         its.queryResults().forEach( v->{
//             for(String key:v.keySet())
//             {
//                 results.add((StockNode) v.get(key));
//             }
//         });


//         System.out.println(results);
//         while (its.iterator().hasNext()){
//             System.out.println(its.iterator().next());
//         }

//         List<StockNode> results = new ArrayList<>();
//
//         its.forEach((v) -> results.add((StockNode) v));
//         System.out.println(results.toString());

//         List<StockNode> stockNodeList=stockRepository.getStockNodeByCustomQuery("match (n:股票) where n.A股名称='601899' return n");
//         List<StockNode> stockNodeList =stockRepository.customQuery("match (n:股票) where n.A股名称='601899' return n");

//         List<StockNode> stockNodeList =respositoryExtension.customQuery("match (n:股票) where n.A股名称='601899' return n");
//        System.out.println(stockNodeList);

    }


}