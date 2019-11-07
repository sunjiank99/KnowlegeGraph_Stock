package org.sunjian.graphdatabaseservice.stock.infrastructure.dao;


import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.sunjian.graphdatabaseservice.stock.infrastructure.po.node.IndustryNode;

import java.util.List;

@Repository
public interface IndustryRepository extends Neo4jRepository<IndustryNode, Long> {
    @Query("MATCH (N:行业)-[r:belong_to]->(M:股票{A股简称: {stockName}}) RETURN N")
    List<IndustryNode> getBelongToStock(String stockName);
}

