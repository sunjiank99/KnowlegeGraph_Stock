package org.sunjian.graphdatabaseservice.controller.restful.stock;


import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.sunjian.graphdatabaseservice.controller.restful.dto.CommonResult;
import org.sunjian.graphdatabaseservice.stock.infrastructure.dao.SecuritiesCategoryRepository;
import org.sunjian.graphdatabaseservice.stock.infrastructure.po.node.SecuritiesCategoryNode;

import java.util.List;

@RestController
@RequestMapping("/securitycategory")
public class SecuritiesCategoryController {

    @Autowired
    SecuritiesCategoryRepository securitiesCategoryRepository;


    @GetMapping("")
    @ApiOperation(value = "根据A股简称查询证券类别")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "stock_astockshortname", dataType = "String", paramType = "query", required = false),
    })
    public Object getSecuritiyCategoryByStockAStockShortName(@RequestParam("stock_astockshortname") String stockAstockShortName) {
        List<SecuritiesCategoryNode> securitiesCategoryNodeList = securitiesCategoryRepository.getSecuritiesCategoryNodeByStockName(stockAstockShortName);
        return new CommonResult().success(securitiesCategoryNodeList);
    }
}
