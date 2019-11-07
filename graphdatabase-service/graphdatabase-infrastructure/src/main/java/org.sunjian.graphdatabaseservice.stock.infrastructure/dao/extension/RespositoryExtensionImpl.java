package org.sunjian.graphdatabaseservice.stock.infrastructure.dao.extension;

import org.neo4j.ogm.model.Result;
import org.neo4j.ogm.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class RespositoryExtensionImpl<T> implements RepositoryExtension<T> {

    @Autowired
    @Qualifier("Neo4jSession")
    Session session; //获取数据连接的session bean

    @Override
    public List<T> customQuery(String query) {
        Map<String, String> params = new HashMap<>();
        Result its = session.query(query,params);
        List<T> results = new ArrayList<>();
        its.queryResults().forEach( v->{
            for(String key:v.keySet()) {
                results.add((T) v.get(key));
            }
        });
        return results;
    }
}
