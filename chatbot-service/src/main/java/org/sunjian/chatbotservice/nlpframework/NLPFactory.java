package org.sunjian.chatbotservice.nlpframework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class NLPFactory {
    public static Object getNLPProxy(Object target) {
        InvocationHandler handler = new NLPProxy(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
    }
}
