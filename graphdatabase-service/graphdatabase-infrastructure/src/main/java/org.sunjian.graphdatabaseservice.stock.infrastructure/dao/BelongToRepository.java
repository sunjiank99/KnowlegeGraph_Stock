package org.sunjian.graphdatabaseservice.stock.infrastructure.dao;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.sunjian.graphdatabaseservice.stock.infrastructure.po.relation.BelongToRelation;

import java.util.List;
import java.util.Map;

@Repository
public interface BelongToRepository extends Neo4jRepository<BelongToRelation, Long> {

    @Query("match path=(n:股票{A股简称:'赛隆药业'})-[*..3]-(m:股票{A股简称:'润都股份'}) return path")
    List<Map<String, Object>> searchAllNode();

    @Query("match path=(n:关系人{关系人名称:'林纪良'})-[*..3]-(m:关系人{关系人名称:'孙清焕'}) return path")
    List<Map<String,Object>> searchRelationBetweenPersion();

    @Query("match path=(n:关系人{关系人名称:{relationPersonName}})-[r]-(m:股票{A股名称:{aShareName}}) RETURN path")
    List<Map<String,Object>> searchRelationBetweenRelationPersonAndStock(String relationPersonName, String aShareName);

}
