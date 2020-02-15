package com.kons.controller;

import com.alibaba.fastjson.JSON;
import com.kons.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestCOntroller {

    @RequestMapping("/hello")
    @ResponseBody
    public String test(){
        return "tom";
    }

    @RequestMapping("/work")
    @ResponseBody
    public String hello(){
        User obj=new User();
        obj.setName("tom");
        obj.setPhone("123456");
        return JSON.toJSONString(obj);
    }
}
