package com.learning.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController
{
    @GetMapping(value="/")
    public String hello(){
        return "This is a Spring Boot API developed by Shabit Taj S";
}
    
}
