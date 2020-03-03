package com.yau.controller;

import com.yau.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    /* 使用 @RequestParam 可以強制要求需要某個請求參數，否則會報錯 */
    @GetMapping("/user")
    public String user(User user, Model model, @RequestParam("game") Integer gg) { // 基本類型建議使用包裝類，這樣為 null 時程序也能正確處理
        model.addAttribute("msg", user);
        System.out.println(gg);
        return "hello";
    }

    @GetMapping("/user1")
    public String user1(User user, ModelMap modelMap) {
        modelMap.addAttribute("msg", user);
        System.out.println("I am /user1");
        return "hello";
    }
}
