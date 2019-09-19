package org.sunjian.chatbotservice.nlpframework;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sunjian.chatbotservice.util.HttpUtil;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Base64;

public class LuisSubject implements NLPSubject {
    private static final Logger log = LoggerFactory.getLogger(LuisSubject.class);

    final private static String url = "https://westus.api.cognitive.microsoft.com/luis/v2.0/apps/6829ddf6-3203-466b-b77e-3a821767de8b?";
    final private static String verbose = "true";
    final private static int timezoneOffset = 0;
    final private static String subscriptionKey = "8be953fdef974670bb415585c2e12619";

    @Override
    public String queryIntentsAndEntity(String query) throws UnsupportedEncodingException {
        String httpUrl= getHttpUrlAppend(query);
        String queryResult = HttpUtil.sendGet(httpUrl);
        return queryResult;
    }

    private String getHttpUrlAppend(String query) throws UnsupportedEncodingException {
        String httpUrl = "https://westus.api.cognitive.microsoft.com/luis/v2.0/apps/6829ddf6-3203-466b-b77e-3a821767de8b?" +
                "verbose="+verbose+
                "&timezoneOffset="+timezoneOffset+
                "&subscription-key="+subscriptionKey+
                "&q="+ URLEncoder.encode(query,"utf-8");
        log.info("httpUrl:{}",httpUrl);
        return httpUrl;
    }
}
