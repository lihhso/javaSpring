package com.example.demo.controller;

import com.example.demo.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Response {
    @RequestMapping("/hello")
    public Result hello() {
//        return new Result(400,"成功","hello,world");
        return Result.success("hello,world");
    }
}
