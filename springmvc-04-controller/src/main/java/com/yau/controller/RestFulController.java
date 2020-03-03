package com.yau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFulController {
    @RequestMapping(path = "/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable int b, Model model) {
        model.addAttribute("msg", "result is: " + (a + b));
        return "hello";
    }
}

