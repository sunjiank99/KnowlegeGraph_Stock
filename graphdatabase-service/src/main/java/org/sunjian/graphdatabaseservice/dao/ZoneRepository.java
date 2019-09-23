package org.sunjian.graphdatabaseservice.dao;


import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.sunjian.graphdatabaseservice.po.node.ZoneNode;

import java.util.List;

@Repository
public interface ZoneRepository extends Neo4jRepository<ZoneNode,Long>{

    @Query("MATCH (N:区域)-[r:belong_to]->(M:股票{A股简称:{stockName}}) RETURN N")
    List<ZoneNode> getZoneNodeBelongToStock(String stockName);

}
