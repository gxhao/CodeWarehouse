package com.xiao.demo.proxy.jdkproxyDemo.impl;

import com.xiao.demo.proxy.jdkproxyDemo.HelloInterface;

public class HelloInterfaceImpl implements HelloInterface {
    @Override
    public void SayHello() {
        System.out.println("hello JDKProxy = " );
    }
}
