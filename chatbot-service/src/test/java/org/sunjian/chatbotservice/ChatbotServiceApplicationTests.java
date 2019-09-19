package org.sunjian.chatbotservice;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.sunjian.chatbotservice.dto.LuisQueryDto;
import org.sunjian.chatbotservice.nlpframework.LuisSubject;
import org.sunjian.chatbotservice.nlpframework.NLPFactory;
import org.sunjian.chatbotservice.nlpframework.NLPSubject;
import org.sunjian.chatbotservice.util.HttpUtil;

import java.io.UnsupportedEncodingException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChatbotServiceApplicationTests {

//    @Test
    public void contextLoads() {
        String url ="https://westus.api.cognitive.microsoft.com/luis/v2.0/apps/6829ddf6-3203-466b-b77e-3a821767de8b?verbose=true&timezoneOffset=0&subscription-key=8be953fdef974670bb415585c2e12619&q=";
        String queryContent="杭州银行属于哪个上市交易所";

        String httpurl=url+queryContent;
        String response=HttpUtil.sendGet("https://westus.api.cognitive.microsoft.com/luis/v2.0/apps/6829ddf6-3203-466b-b77e-3a821767de8b?verbose=true&timezoneOffset=0&subscription-key=8be953fdef974670bb415585c2e12619&q=%E6%9D%AD%E5%B7%9E%E9%93%B6%E8%A1%8C%E5%B1%9E%E4%BA%8E%E5%93%AA%E4%B8%AA%E4%B8%8A%E5%B8%82%E4%BA%A4%E6%98%93%E6%89%80");
        LuisQueryDto luisQueryDto= JSON.parseObject(response,LuisQueryDto.class);

        System.out.println(response);
    }

    @Test
    public void nlpProxyTest() throws UnsupportedEncodingException {

        NLPSubject nlpSubject =(NLPSubject) NLPFactory.getNLPProxy(new LuisSubject());
        String result=nlpSubject.queryIntentsAndEntity("恒生电子属于哪个地域板块");
        System.out.println(result);
    }

}
