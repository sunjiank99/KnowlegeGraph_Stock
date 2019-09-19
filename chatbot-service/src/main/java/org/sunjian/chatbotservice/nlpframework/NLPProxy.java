package org.sunjian.chatbotservice.nlpframework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NLPProxy implements InvocationHandler {

    private Object target; //被代理的对象
    public NLPProxy(Object obj){
        this.target=obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=method.invoke(target,args);
        return result;
    }
}
