package org.sunjian.graphdatabaseservice.dao;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.GraphQueryExecution;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sunjian.graphdatabaseservice.dao.extension.RepositoryExtension;
import org.sunjian.graphdatabaseservice.dao.extension.StockRepositoryExtension;
import org.sunjian.graphdatabaseservice.po.node.StockNode;

import java.util.List;

@Repository
public interface StockRepository extends Neo4jRepository<StockNode, Long>,StockRepositoryExtension{

    @Query("MATCH (n:`股票`) RETURN n ")
    List<StockNode> getStockNodeList();

    //Query查询
    @Query("match (n:股票) where n.A股简称={aShareShortName} return n")
    List<StockNode> getStockNodeByAShareShortName(@Param("aShareShortName") String aShareShortName);


    //jpa命名规范查询股票名称
    List<StockNode> findAllByAShareShortName(String aShareShortName);

    List<StockNode> findAllByAShareName(String aShareName);

}
