package com.yau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("loginPage")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/verify")
    public String login(HttpSession session, String username, String password, Model model) {
        if (username == null || username.equals("")) {
            return "login";
        }
        session.setAttribute("userLoginInfo", username);
        model.addAttribute("username", username);
        return "main";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("userLoginInfo");
        return "main";
    }
}
