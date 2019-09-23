package org.sunjian.graphdatabaseservice.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.sunjian.graphdatabaseservice.po.node.RelationPersonNode;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RelationPersonRepositoryTest {
    @Autowired
    private RelationPersonRepository relationPersonRepository;
    @Test
    public void test(){
        List<RelationPersonNode> relationPersonNodeList=relationPersonRepository.findByStockNameAndPosition("乐视网","财务总监");
    }


}