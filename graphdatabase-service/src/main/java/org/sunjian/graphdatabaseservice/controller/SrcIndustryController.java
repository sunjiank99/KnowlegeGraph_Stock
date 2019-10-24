package org.sunjian.graphdatabaseservice.controller;


import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.sunjian.graphdatabaseservice.dao.SrcIndustryRepository;
import org.sunjian.graphdatabaseservice.dto.CommonResult;
import org.sunjian.graphdatabaseservice.po.node.SrcIndustryNode;
import org.sunjian.graphdatabaseservice.po.node.ZoneNode;

import java.util.List;

@RestController
@RequestMapping("/srcindustry")
public class SrcIndustryController {

    @Autowired
    SrcIndustryRepository srcIndustryRepository;

    @GetMapping("")
    @ApiOperation(value = "根据A股简名查询所属证监会行业实体")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "stock_astockshortname", dataType = "String", paramType = "query", required = false)
    })
    public Object getSrcIndustryByStockAStockShortName(@RequestParam(value = "stock_astockshortname") String stockAStockShortName) {
        List<SrcIndustryNode> srcIndustryNodeList = srcIndustryRepository.getSrcIndustryNodeByStockShortName(stockAStockShortName);
        return new CommonResult().success(srcIndustryNodeList);
    }
}
