package com.yau.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yau.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/json")
public class JsonDemoController {
    // 使用了這一個註解就不會走視圖解析器的道路，而是直接給前端返回字符串
    @ResponseBody
    @RequestMapping(value = "/test1", produces = "application/json")
    public String json() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User();
        user.setName("邱文奎");
        user.setAge(25);
        user.setId(2020);
        return mapper.writeValueAsString(user);
    }

    @ResponseBody
    @RequestMapping(value = "/test2", produces = "application/json")
    public String json2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        List<User> list = new ArrayList<>();
        list.add(new User(1, "Manfred", 25));
        list.add(new User(2, "Man to", 25));
        return mapper.writeValueAsString(list);
    }

    @ResponseBody
    @RequestMapping(value = "/test3", produces = "application/json")
    public String json3() throws JsonProcessingException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY/MM/dd");
        String format = simpleDateFormat.format(new Date());
        return new ObjectMapper().writeValueAsString(format);
    }

    @ResponseBody
    @RequestMapping(value = "/test4")
    public String json4() {
        List<User> list = new ArrayList<>(Arrays.asList(
                new User(1, "邱文奎", 25),
                new User(2, "溫文濤", 25)
        ));
        String s = JSON.toJSONString(list);
        return s;
    }
}
