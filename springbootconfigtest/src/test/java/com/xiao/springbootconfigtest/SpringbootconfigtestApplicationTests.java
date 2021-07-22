package com.xiao.springbootconfigtest;

import com.xiao.demo.springbootDemo.configRationDemo.enableConfigDemo.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

@SpringBootTest
class SpringbootconfigtestApplicationTests {

    @Autowired
    MyService myService;

    @Test
    void contextLoads() {
        System.out.println("myService = " + myService);
    }

}
