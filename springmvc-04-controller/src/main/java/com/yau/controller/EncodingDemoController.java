package com.yau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EncodingDemoController {
    @GetMapping("/encodingDemo")
    public String test1(String name, Model model) {
        model.addAttribute("msg", name);
        return "hello";
    }
}
