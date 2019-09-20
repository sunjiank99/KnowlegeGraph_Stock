package org.sunjian.chatbotservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="KOWNLEGE-GRAPH-DATABASE-SERVER")
public interface Relation {

    @GetMapping("/get/relation")
    public String getRelation();

}
