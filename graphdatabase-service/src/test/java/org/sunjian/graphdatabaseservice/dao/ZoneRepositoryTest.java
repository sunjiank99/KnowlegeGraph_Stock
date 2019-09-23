package org.sunjian.graphdatabaseservice.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.sunjian.graphdatabaseservice.po.node.StockNode;
import org.sunjian.graphdatabaseservice.po.node.ZoneNode;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZoneRepositoryTest {

    @Autowired
    ZoneRepository zoneRepository;

    @Test
    public void getBelongToStockTest(){
        List<ZoneNode> zoneNodeList=zoneRepository.getZoneNodeBelongToStock("恒生电子");
    }
}