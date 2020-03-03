package com.yau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class ModelTest1 {
    @GetMapping("m1/t1")
    public String test1(HttpServletRequest request, HttpServletResponse response, Model model) {
        HttpSession session = request.getSession();
        model.addAttribute("msg", session.getId());
        return "hello";
    }

    @GetMapping("m1/t2")
    public void test2(HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println(request.getSession().getId());
    }

    @GetMapping("m1/t3")
    public String test3(Model model) {
        model.addAttribute("msg", "success");

//        redirect:後如果加了 / 說明後面跟著的是根目錄，沒有的話則為當剈目錄的相對路徑
        return "redirect:/index.jsp";
    }
}
