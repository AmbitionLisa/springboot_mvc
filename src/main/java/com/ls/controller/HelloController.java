package com.ls.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("hello")
public  String hello(){
    System.out.println("我爱学zha1 ");
        System.out.println("齐天大圣");
    return "hello springboot";
}

}
