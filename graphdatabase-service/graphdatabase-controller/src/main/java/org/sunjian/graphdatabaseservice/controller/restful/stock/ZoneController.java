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
import org.sunjian.graphdatabaseservice.stock.infrastructure.dao.ZoneRepository;
import org.sunjian.graphdatabaseservice.stock.infrastructure.po.node.ZoneNode;

import java.util.List;

@RestController
@RequestMapping("/zone")
public class ZoneController {
    @Autowired
    ZoneRepository zoneRepository;

    @GetMapping("")
    @ApiOperation(value = "根据A股名称（股票代码）查询区域实体")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "stock_astockshortname", dataType = "String", paramType = "query", required = false)
    })
    public Object getZoneByStockAStockShortName(@RequestParam(value = "stock_astockshortname") String stockAStockShortName) {
        List<ZoneNode> zoneNodeList = zoneRepository.getZoneNodeBelongToStock(stockAStockShortName);
        return new CommonResult().success(zoneNodeList);
    }
}
