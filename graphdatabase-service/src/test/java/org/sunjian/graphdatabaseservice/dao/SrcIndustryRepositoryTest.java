package org.sunjian.graphdatabaseservice.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.sunjian.graphdatabaseservice.po.node.SrcIndustryNode;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SrcIndustryRepositoryTest {

    @Autowired
    SrcIndustryRepository srcIndustryRepository;

    @Test
    public void test(){
        List<SrcIndustryNode> list=srcIndustryRepository.getSrcIndustryNodeByStockShortName("恒生电子");
        System.out.println(list);
    }

}