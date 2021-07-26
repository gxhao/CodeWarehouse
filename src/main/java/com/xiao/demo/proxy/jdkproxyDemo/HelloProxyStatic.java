package com.xiao.demo.proxy.jdkproxyDemo;

import com.xiao.demo.proxy.cglibproxyDemo.HelloProxy;
import com.xiao.demo.proxy.jdkproxyDemo.impl.HelloInterfaceImpl;

public class HelloProxyStatic implements HelloInterface {
    private HelloInterface helloInterface=new HelloInterfaceImpl();

    @Override
    public void SayHello() {
        System.out.println("Before = ");
        helloInterface.SayHello();
        System.out.println("After = ");
    }
}
