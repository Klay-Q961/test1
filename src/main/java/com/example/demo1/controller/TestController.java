package com.example.demo1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String test(){
        //888888888888888888ssssss888888ossssk
        return "123";
    }
}
