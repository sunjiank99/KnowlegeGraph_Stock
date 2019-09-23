package org.sunjian.graphdatabaseservice.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.sunjian.graphdatabaseservice.po.node.IndustryNode;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IndustryRepositoryTest {

    @Autowired
    private IndustryRepository industryRepository;

    @Test
    public void getBelongToStock(){
        List<IndustryNode> industryNodeList =industryRepository.getBelongToStock("恒生电子") ;
    }
}