package org.sunjian.graphdatabaseservice.dao;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.sunjian.graphdatabaseservice.po.relation.BelongToRelation;

import java.util.List;
import java.util.Map;

@Repository
public interface BelongToRepository extends Neo4jRepository<BelongToRelation,Long> {

    @Query("match path=(n:股票{A股简称:'赛隆药业'})-[*..3]-(m:股票{A股简称:'润都股份'}) return path")
    List<Map<String,Object>> searchAllNode();


}
