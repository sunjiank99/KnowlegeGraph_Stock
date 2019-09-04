package org.sunjian.graphdatabaseservice.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.sunjian.graphdatabaseservice.po.StockNode;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StockRepositoryTest {

     @Autowired
     StockRepository stockRepository;

     @Test
     public void Test(){
         List<StockNode> stockNodeList=stockRepository.getStockNodeList();
         for(StockNode item:stockNodeList){
             System.out.println(item.toString());
         }

     }


}