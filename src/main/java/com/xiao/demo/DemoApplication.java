package com.xiao.demo;

import com.xiao.demo.Async.AnnotationSync.AnnotationSyncService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        AnnotationSyncService bean = context.getBean(AnnotationSyncService.class);
        System.out.println("Async Start");
        bean.sync();
        System.out.println("Async Stop");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(DemoApplication.class);
    }


}
