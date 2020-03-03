package com.yau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController2 {
    @RequestMapping("/hello2")
    public String hello(Model model) {
        model.addAttribute("msg", "I very love Java");
        return "hello";
    }
}
