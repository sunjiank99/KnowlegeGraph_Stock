package org.sunjian.graphdatabaseservice.dao.extension;

import org.neo4j.ogm.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.neo4j.repository.query.GraphQueryExecution;
import org.springframework.data.neo4j.repository.query.GraphRepositoryQuery;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;
import org.sunjian.graphdatabaseservice.dao.StockRepository;
import org.sunjian.graphdatabaseservice.po.node.StockNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StockRepositoryExtensionImpl implements StockRepositoryExtension{

    @Autowired
    @Qualifier("Neo4jSession")
    Session session; //获取数据连接的session bean

    @Override
    public List<StockNode> getStockNodeByCustomQuery(String query) {
        Map<String, String> params = new HashMap<>();
//         Result result =session.query("match (n:股票) where n.A股名称='601899' return n",params);
         Iterable<StockNode> its = session.query(StockNode.class,query, params);
         List<StockNode> results = new ArrayList<>();
         its.forEach((v) -> results.add(v));
         return  results;
    }

}
