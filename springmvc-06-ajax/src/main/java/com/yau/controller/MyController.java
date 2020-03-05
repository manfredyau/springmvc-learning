package com.yau.controller;

import com.yau.pojo.User;
import com.yau.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ajax")
public class MyController {
    private final UserService userService;

    public MyController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/test1")
    public String test1() {
        return "Let's begin";
    }

    @RequestMapping("/test2")
    public void test2(String name, HttpServletResponse response) throws IOException {
        System.out.println("I am going to /test2");
        if (name.length() >= 1) {
            response.getWriter().println("66666666666");
        }
    }

    @RequestMapping("/test3")
    public void test3(HttpServletResponse response) throws IOException {
        response.setContentType("text/plain");
        response.getWriter().println("66666666666");
    }

    @RequestMapping("/test4")
    public List<User> test4() {
        List<User> users = new ArrayList<>(Arrays.asList(
                new User(1, "Manfred", "FSqwk123", 25),
                new User(2, "Manto", "GZwwt123", 25)
        ));
        return users;
    }

    @RequestMapping("/test5")
    public String test5(String username, String password) {
        User user = userService.findUserByName(username);
        System.err.println(user);
        String result = "Failed";
//        if (username != null) {
//            if (username.equals("admin")) {
//                result = "OK";
//            } else {
//                result = "failed";
//            }
//        }
        if (user != null) {
            boolean condition = user.getName()
                    .equals(username);
            if (password == null) {
                if (condition) {
                    result = "Good";
                }
            } else if (condition && user.getPassword()
                    .equals(password)) {
                result = "Good";
            }
        }

//        if (password != null) {
//            if (password.equals("abcd")) {
//                result = "OK";
//            } else {
//                result = "failed";
//            }
//        }
        return result;
    }
}
