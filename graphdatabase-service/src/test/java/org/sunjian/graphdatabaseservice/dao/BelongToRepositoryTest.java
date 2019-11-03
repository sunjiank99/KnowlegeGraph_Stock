package org.sunjian.graphdatabaseservice.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.sunjian.graphdatabaseservice.po.node.IndustryNode;

import javax.jws.Oneway;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BelongToRepositoryTest {
      @Autowired
      BelongToRepository belongToRepository;

      @Test
      public void getRelationBetweenRelaitonPersonAndStock(){

          List<Map<String,Object>> list =belongToRepository.searchRelationBetweenRelationPersonAndStock("孙清焕","002745");
          List<Map<String,Object>> list2 =belongToRepository.searchRelationBetweenPersion();
          List<Map<String, Object>> list13=belongToRepository.searchAllNode();

          System.out.println(list);
      }
}