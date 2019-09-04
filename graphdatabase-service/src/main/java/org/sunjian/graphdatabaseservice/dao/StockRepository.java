package org.sunjian.graphdatabaseservice.dao;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.GraphRepositoryQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.sunjian.graphdatabaseservice.po.StockNode;

import java.util.List;

@Component
public interface StockRepository extends Neo4jRepository<StockNode,Long> {
    @Transactional
    @Query("MATCH (n:`股票`) RETURN n ")
    List<StockNode> getStockNodeList();

}
