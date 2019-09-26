package org.sunjian.graphdatabaseservice.dao;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.sunjian.graphdatabaseservice.po.node.SrcIndustryNode;

import java.util.List;

@Repository
public interface SrcIndustryRepository extends Neo4jRepository<SrcIndustryNode,Long> {

    @Query("MATCH (N:所属证监会行业)-[r:belong_to]->(M:股票{A股简称:{stockShortName}}) RETURN N")
    List<SrcIndustryNode> getSrcIndustryNodeByStockShortName(String stockShortName);

}
