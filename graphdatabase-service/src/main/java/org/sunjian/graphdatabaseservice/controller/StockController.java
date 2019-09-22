package org.sunjian.graphdatabaseservice.controller;


import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sunjian.graphdatabaseservice.dao.BelongToRepository;
import org.sunjian.graphdatabaseservice.dao.StockRepository;
import org.sunjian.graphdatabaseservice.dto.CommonResult;
import org.sunjian.graphdatabaseservice.po.node.StockNode;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private BelongToRepository belongToRepository;

    @Autowired
    private StockRepository stockRepository;

    @GetMapping("/relation")
    public String getRelation(){
        List<Map<String,Object>> objectlist =  belongToRepository.searchAllNode();
        return  objectlist.toString();
    }

    @GetMapping("/asn/{aStockName}")
    @ApiOperation(value = "根据A股名称（股票代码）查询股票节点")
    public Object getStockByAStockName(@PathVariable("aStockName") String aStockName){
        List<StockNode> stockNodeList = stockRepository.findAllByAShareName(aStockName);
        CommonResult commonResult =new CommonResult();
        commonResult.success(stockNodeList);
        return commonResult;
    }

    @GetMapping("/assn/{aStockShortName}")
    @ApiOperation(value = "根据A股简称查询股票节点")
    public Object getStockByAStockShortName(@PathVariable String aStockShortName){
        List<StockNode> stockNodeList=stockRepository.findAllByAShareShortName(aStockShortName);
        CommonResult commonResult =new CommonResult();
        commonResult.success(stockNodeList);
        return commonResult;
    }





}
