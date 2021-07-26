package com.xiao.demo.proxy.jdkproxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HelloDynamicProxy implements InvocationHandler {
    private  Object object;

    public HelloDynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(object,args);
        return null;
    }
}
