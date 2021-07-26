package com.xiao.demo.proxy.jdkproxyDemo;

import com.xiao.demo.proxy.jdkproxyDemo.impl.HelloInterfaceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainMethod {
    public static void main(String[] args) {
        HelloProxyStatic helloProxyStatic = new HelloProxyStatic();
        helloProxyStatic.SayHello();


        //动态
        HelloInterfaceImpl helloInterface = new HelloInterfaceImpl();
        InvocationHandler handler = new HelloDynamicProxy(helloInterface);
        HelloInterface helloInterfaceProxy = (HelloInterface)Proxy.newProxyInstance(handler.getClass().getClassLoader(), helloInterface.getClass().getInterfaces(), handler);
        helloInterfaceProxy.SayHello();
    }
}
