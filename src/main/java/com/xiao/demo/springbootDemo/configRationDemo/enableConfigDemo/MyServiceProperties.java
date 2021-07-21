package com.xiao.demo.springbootDemo.configRationDemo.enableConfigDemo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/**
 * @Author gxhao
 * @Date 2021/7/22 1:42
 * @Description 属性配置
 * @Param
 * @Return
 * @Since version-1.0
 */
@Component
@ConfigurationProperties(prefix = "yang.service")
public class MyServiceProperties {
    private MyServiceProperties.MyProperties myProperties = new MyServiceProperties.MyProperties();

    public MyProperties getMyProperties() {
        return myProperties;
    }

    public void setMyProperties(MyProperties myProperties) {
        this.myProperties = myProperties;
    }
    @Data
    public static class MyProperties{
        public static final String DEFAULT_NAME;
        private String author;
        private String age;

        static {
            DEFAULT_NAME = "yg";
        }
    }
}