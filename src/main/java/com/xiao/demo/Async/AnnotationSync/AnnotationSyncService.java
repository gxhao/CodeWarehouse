package com.xiao.demo.Async.AnnotationSync;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AnnotationSyncService {

    @Async
    public String sync(){
        System.out.println("Async task succ"+Thread.currentThread().getName());
        return "async task success";
    }
}
