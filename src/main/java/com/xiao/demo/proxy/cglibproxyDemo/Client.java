package com.xiao.demo.proxy.cglibproxyDemo;

import org.springframework.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloProxy.class);
        enhancer.setCallback(new HelloMethodInterceptor());
        HelloProxy helloProxy = (HelloProxy)enhancer.create();
        helloProxy.sayHello();
    }
}
