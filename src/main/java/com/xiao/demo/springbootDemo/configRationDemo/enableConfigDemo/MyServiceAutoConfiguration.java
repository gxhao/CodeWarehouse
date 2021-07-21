package com.xiao.demo.springbootDemo.configRationDemo.enableConfigDemo;


import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author gxhao
 * @Date 2021/7/22 1:43
 * @Description 自动配置类
 * @Param
 * @Return
 * @Since version-1.0
 */
@Configuration
@EnableConfigurationProperties(MyServiceProperties.class)
@ConditionalOnClass(MyService.class)
@ConditionalOnProperty(prefix = "yang.service",value = "enabled",matchIfMissing = true)
public class MyServiceAutoConfiguration {
    private MyServiceProperties.MyProperties properties;

    public MyServiceAutoConfiguration(MyServiceProperties properties) {
        this.properties = properties.getMyProperties();
    }

    @Bean
    @ConditionalOnMissingBean(MyService.class)
    public MyService myService(){
        MyService myService = new MyService();
        myService.setName(properties.getAuthor());
        myService.setAge(properties.getAge());
        return myService;
    }
}