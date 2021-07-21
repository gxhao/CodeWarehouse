package com.xiao.demo;

import com.xiao.demo.springbootDemo.configrationDemo.basicConfig.UserBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConfigTest {
    @Autowired
    UserBean userBean;

    @Test
    void contextLoads(){
        System.out.println("userBean = " + userBean);
    }
}
