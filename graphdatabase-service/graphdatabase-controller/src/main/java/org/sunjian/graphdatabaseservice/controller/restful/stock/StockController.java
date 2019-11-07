package org.sunjian.graphdatabaseservice.controller.restful.stock;


import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.sunjian.graphdatabaseservice.controller.restful.dto.CommonResult;
import org.sunjian.graphdatabaseservice.stock.infrastructure.dao.BelongToRepository;
import org.sunjian.graphdatabaseservice.stock.infrastructure.dao.StockRepository;
import org.sunjian.graphdatabaseservice.stock.infrastructure.po.node.StockNode;

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
    public String getRelation() {
        List<Map<String, Object>> objectlist = belongToRepository.searchAllNode();
        return objectlist.toString();
    }


    @GetMapping("")
    @ApiOperation(value = "根据A股名称（股票代码）查询股票实体")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "astockname", dataType = "String", paramType = "query",required = false),
            @ApiImplicitParam(name = "astockshortname", dataType = "String", paramType = "query",required =false)
    })
    public Object getStockByAStockName(@RequestParam(value = "astockname",required = false) String aStockName,@RequestParam(value = "astockshortname",required = false)String aStockShortName) {

        if (aStockName!=null && aStockShortName!=null) {
            return new CommonResult().validateFailed("参数只允许一个");
        } else if (aStockName!=null) {
            List<StockNode> stockNodeList = stockRepository.findAllByAShareName(aStockName);
            return new CommonResult().success(stockNodeList);
        } else if (aStockShortName!=null) {
            List<StockNode> stockNodeList = stockRepository.findAllByAShareShortName(aStockShortName);
            return new CommonResult().success(stockNodeList);
        }
        return new CommonResult().validateFailed("参数不能都为空");
    }







}
