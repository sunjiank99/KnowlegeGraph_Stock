package org.sunjian.chatbotservice.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sunjian.chatbotservice.nlpframework.LuisSubject;
import org.sunjian.chatbotservice.nlpframework.NLPFactory;
import org.sunjian.chatbotservice.nlpframework.NLPSubject;

import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("/query")
public class QueryController {

    @GetMapping("/luis")
    public Object queryToLuis(String query){
        NLPSubject nlpSubject =(NLPSubject) NLPFactory.getNLPProxy(new LuisSubject());
        String result = "";
        try {
            result=nlpSubject.queryIntentsAndEntity(query);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

}
