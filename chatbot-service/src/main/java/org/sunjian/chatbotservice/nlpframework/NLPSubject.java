package org.sunjian.chatbotservice.nlpframework;

import org.sunjian.chatbotservice.dto.LuisQueryDto;

import java.io.UnsupportedEncodingException;

public interface NLPSubject {

    String queryIntentsAndEntity(String query) throws UnsupportedEncodingException;

}
