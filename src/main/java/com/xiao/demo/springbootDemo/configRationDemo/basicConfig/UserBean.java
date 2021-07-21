package com.xiao.demo.springbootDemo.configRationDemo.basicConfig;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:application.yaml")
@ConfigurationProperties(prefix = "user")
@Setter  //通过set注入
@ToString //方便测试
public class UserBean {

    public  String author;
    public  int age;
}
