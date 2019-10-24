package org.sunjian.graphdatabaseservice.controller;


import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.sunjian.graphdatabaseservice.dao.ListedExchangeNodeRepository;
import org.sunjian.graphdatabaseservice.dto.CommonResult;
import org.sunjian.graphdatabaseservice.po.node.ListedExchangeNode;

import java.util.List;

@RestController
@RequestMapping("/listedexchang")
public class ListedExchangController {

    @Autowired
    ListedExchangeNodeRepository listedExchangeNodeRepository;

    @GetMapping("")
    @ApiOperation(value = "根据A股简称查询上市交易所")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "stock_astockshortname", dataType = "String", paramType = "query", required = false),
    })
    public Object getListtedExchangByStockAshortName( @RequestParam(value = "stock_astockshortname") String stockAstockShortNAme){
        List<ListedExchangeNode> listedExchangeNodeList =listedExchangeNodeRepository.getListedExchangeNodeByStockShartName(stockAstockShortNAme);
        return new CommonResult().success(listedExchangeNodeList);
    }
}
