package org.sunjian.graphdatabaseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableNeo4jRepositories(basePackages = "org.sunjian.graphdatabaseservice.dao")
public class GraphdatabaseServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphdatabaseServiceApplication.class, args);
    }

}
