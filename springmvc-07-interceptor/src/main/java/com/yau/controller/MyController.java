package com.yau.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interceptor")
public class MyController {
    @GetMapping("/test1")
    public String test1() {
        System.out.println("Hello world");
        return "Hello world";
    }
}
