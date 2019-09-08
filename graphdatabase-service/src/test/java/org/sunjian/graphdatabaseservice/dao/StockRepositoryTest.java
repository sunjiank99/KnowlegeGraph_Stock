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

     @Test
     public void Test(){
//         List<StockNode> stockNodeList=stockRepository.getStockNodeList();
//         for(StockNode item:stockNodeList){
//             System.out.println(item.toString());
//         }
//         Optional<BelongToRelation> belongToRelation=  belongToRepository.findById(Long.valueOf(4375));

//         Iterable<BelongToRelation> belongToRelations =  belongToRepository.findAll();
         List<Map<String,Object>> list=belongToRepository.searchAllNode();
         System.out.println(list);
     }


}