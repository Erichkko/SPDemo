package com.wl.demo.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/demo")
public class HelloController {

    @Value("${person.last-name}")
    private String lastName;

    @GetMapping("/hello")
    public String hello(){
        log.error("lastname == "+lastName);
        return "你好:"+lastName;
    }
}
