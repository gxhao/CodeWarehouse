package com.xiao.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
//@ConfigurationProperties(prefix = "person")
@PropertySource(value = "classpath:application.yaml")
public class Person {
    // el表达式
    @Value("${name}")
    private  String name;
    private  Integer age;
}
