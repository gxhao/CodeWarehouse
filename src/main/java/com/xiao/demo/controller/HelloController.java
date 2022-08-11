package com.xiao.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("test")
    public String test(){
        System.out.println("进入系统");
        return "今天很开心能够分享DevOps的一些知识!!";
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}



