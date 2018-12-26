package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class democontroller {
    @GetMapping("/demo")
    public String demo(){
        return "hello demo3";
    }
}
