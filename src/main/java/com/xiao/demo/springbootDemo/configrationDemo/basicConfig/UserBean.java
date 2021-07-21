package com.xiao.demo.springbootDemo.configrationDemo.basicConfig;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:yang.properties")
@ConfigurationProperties(prefix = "user")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserBean {

    private  String author;
    private  int age;

}
