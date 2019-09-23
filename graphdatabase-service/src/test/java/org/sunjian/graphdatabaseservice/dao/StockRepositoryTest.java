package org.sunjian.graphdatabaseservice.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.sunjian.graphdatabaseservice.po.node.RelationPersonNode;
import org.sunjian.graphdatabaseservice.po.node.StockNode;
import org.sunjian.graphdatabaseservice.po.relation.BelongToRelation;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StockRepositoryTest {

     @Autowired
     StockRepository stockRepository;

     @Autowired
      BelongToRepository belongToRepository;

//     @Test
     public void Test(){
         List<StockNode> stockNodeList=stockRepository.getStockNodeByAShareShortName("棕榈股份");
         System.out.println(stockNodeList);
     }

     @Test
    public void StockByQueryNameTest(){
         List<StockNode> stockNodeList=stockRepository.getStockNodeByQueryProperty("董事长","吴桂昌");
         System.out.println(stockNodeList);
     }


}