package org.sunjian.graphdatabaseservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sunjian.graphdatabaseservice.dao.BelongToRepository;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/get")
public class StockController {

    @Autowired
    BelongToRepository belongToRepository;

    @GetMapping("/relation")
    public String getRelation(){

        List<Map<String,Object>> objectlist =  belongToRepository.searchAllNode();

        return  objectlist.toString();
    }

}
