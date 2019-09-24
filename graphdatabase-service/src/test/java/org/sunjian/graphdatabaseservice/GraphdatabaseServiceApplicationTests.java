package org.sunjian.graphdatabaseservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GraphdatabaseServiceApplicationTests {
//    @Autowired
//    private Session session;

//    @Test
    public void contextLoads() {
    }


    @Test
    public void sessionNeo4jDriverTest(){
//        Driver driver = GraphDatabase.driver( "bolt://localhost:7687", AuthTokens.basic( "neo4j", "123456" ) );

        SessionFactory sessionFactory=new SessionFactory();

//        Session session = new SessionFactory().
//        StatementResult result = session.run("MATCH (N:行业)-[r:belong_to]->(M:股票{A股简称:'棕榈股份'}) RETURN N");
//        while ( result.hasNext() )
//        {
//            Record record = result.next();
//            System.out.println( record.get( "行业名称" ).asString() + " " + record.get( "Industry" ).asString() );
//        }
//
//        session.close();
//        driver.close();

    }
}
