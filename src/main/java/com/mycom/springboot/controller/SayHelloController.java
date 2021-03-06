package com.mycom.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/sayhello")
    public String sayHello(){
        return "hello:" + name;
    }
}
