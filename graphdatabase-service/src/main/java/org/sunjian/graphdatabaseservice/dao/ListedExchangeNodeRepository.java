package org.sunjian.graphdatabaseservice.dao;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.sunjian.graphdatabaseservice.po.node.ListedExchangeNode;

import java.util.List;

@Repository
public interface ListedExchangeNodeRepository extends Neo4jRepository<ListedExchangeNodeRepository,Long> {

    @Query("MATCH (N:上市交易所)-[r:belong_to]->(M:股票{A股简称:{stockShortName}}) RETURN N")
    List<ListedExchangeNode> getListedExchangeNodeByStockShartName(String stockShortName);
}
