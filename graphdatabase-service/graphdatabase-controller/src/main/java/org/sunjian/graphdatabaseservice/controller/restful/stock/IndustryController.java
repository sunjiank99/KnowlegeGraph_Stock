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
import org.sunjian.graphdatabaseservice.stock.infrastructure.dao.IndustryRepository;
import org.sunjian.graphdatabaseservice.stock.infrastructure.po.node.IndustryNode;
import java.util.List;

@RestController
@RequestMapping("/industry")
public class IndustryController {
    @Autowired
    IndustryRepository industryRepository;

    @GetMapping("")
    @ApiOperation(value = "根据A股简称查询行业实体")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "stock_astockshortname", dataType = "String", paramType = "query", required = false),
    })
    public Object getIndustryByStockAssn(@RequestParam(value = "stock_astockshortname") String stockAStockShortName) {
        List<IndustryNode> industryNodeList=industryRepository.getBelongToStock(stockAStockShortName);
        return new CommonResult().success(industryNodeList);
    }


}
