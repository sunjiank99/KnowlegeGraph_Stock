package org.sunjian.graphdatabaseservice.config;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableNeo4jRepositories(basePackages = "org.sunjian.graphdatabaseservice.dao")
@EnableTransactionManagement
public class Neo4JConfig {
    @Bean
    public SessionFactory sessionFactory() {
        org.neo4j.ogm.config.Configuration configuration = new org.neo4j.ogm.config.Configuration.Builder()
                .uri("bolt://localhost:7687")
                .credentials("neo4j", "123456")
                .build();
        // with domain entity base package(s)
        return new SessionFactory(configuration,"org.sunjian.graphdatabaseservice.po","org.sunjian.graphdatabaseservice.po.node");
    }

    @Bean
    public Neo4jTransactionManager transactionManager() {
        return new Neo4jTransactionManager(sessionFactory());
    }

    @Bean(name="Neo4jSession")
    public Session session() {
        return transactionManager().getSessionFactory().openSession();
    }
}
