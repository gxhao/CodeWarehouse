package com.xiao.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("test")
    public String test(){
        System.out.println("进入系统");
        return "hello,ci/cd test success!!";
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}



