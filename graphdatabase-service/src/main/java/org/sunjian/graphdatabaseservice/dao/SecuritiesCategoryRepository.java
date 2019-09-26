package org.sunjian.graphdatabaseservice.dao;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.sunjian.graphdatabaseservice.po.node.SecuritiesCategoryNode;

import java.util.List;

@Repository
public interface SecuritiesCategoryRepository extends Neo4jRepository<SecuritiesCategoryNode,Long> {

    @Query("MATCH (N:证券类别)-[r:belong_to]->(M:股票{A股简称:{stockName}}) RETURN N")
    List<SecuritiesCategoryNode> getSecuritiesCategoryNodeByStockName(String stockName);
}
