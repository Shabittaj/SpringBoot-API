package com.learning.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController
{
    @GetMapping(value="/")
    public String hello(){
        return "welcome to spring boot demo developed by taj";
}

}
