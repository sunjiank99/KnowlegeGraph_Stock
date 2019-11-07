package org.sunjian.graphdatabaseservice.stock.infrastructure.dao;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.sunjian.graphdatabaseservice.stock.infrastructure.po.node.RelationPersonNode;

import java.util.List;

@Repository
public interface RelationPersonRepository extends Neo4jRepository<RelationPersonNode,Long> {

    List<RelationPersonNode> findByStockNameAndPosition(String stockName, String position);
}
