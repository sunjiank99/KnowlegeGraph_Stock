package org.sunjian.graphdatabaseservice.controller;


import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.sunjian.graphdatabaseservice.dao.BelongToRepository;
import org.sunjian.graphdatabaseservice.dto.CommonResult;

import java.util.List;
import java.util.Map;

@RestController
public class RelationController {

    @Autowired
    BelongToRepository belongToRepository;

    @GetMapping("/relation/rlpersontostock")
    @ApiOperation(value = "查询关系人和股票之间的关系")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "rlperson_rlpname", dataType = "String", paramType = "query", required = false),
            @ApiImplicitParam(name = "rlperson_asharemame", dataType = "String", paramType = "query", required = false)
    })
    public Object  getRelstionBetweenRelationPersonAndStock(@RequestParam(value = "rlperson_rlpname") String relationPersonName, @RequestParam(value = "rlperson_asharemame") String aShareName) {
        List<Map<String, Object>> relations = belongToRepository.searchRelationBetweenRelationPersonAndStock(relationPersonName, aShareName);

        return relations.get(0);
    }
}
