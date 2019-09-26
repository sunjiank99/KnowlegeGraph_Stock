package org.sunjian.graphdatabaseservice.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.sunjian.graphdatabaseservice.po.node.ListedExchangeNode;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ListedExchangeRepositoryTest  {

    @Autowired
    ListedExchangeNodeRepository listedExchangeNodeRepository;

    @Test
    public void test(){

        List<ListedExchangeNode> list = listedExchangeNodeRepository.getListedExchangeNodeByStockShartName("全志科技");
        System.out.println(list);
    }

}