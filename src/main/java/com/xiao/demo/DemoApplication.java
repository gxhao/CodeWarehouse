package com.xiao.demo;

import com.xiao.demo.Async.AnnotationSync.AnnotationSyncService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        AnnotationSyncService bean = context.getBean(AnnotationSyncService.class);
        System.out.println("Async Start");
        bean.sync();
        System.out.println("Async Stop");
    }

}
