package com.example.demo.controller;

import com.example.demo.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
//@RestController
//@Controller
//@RestController将返回值变为响应的json
public class RequestController {
@RequestMapping("/simpleParam")
//简单的参数传递
    public String simpleParam(String name,Integer age){
    System.out.println(name+":"+age);
    return "ok";
}
//封装的参数传递，封装类在pojo包里
@RequestMapping("/simplePojo")
public String simplePojo(User user ){
    System.out.println(user);
    return "ok";
}
//方法形参和传递参数名不同的处理方式
@RequestMapping("/differentParamName")
public String differentParamName(@RequestParam(name = "name") String username, Integer age){
    //将参数 name和形参username映射起来，在接口测试时使用name
    System.out.println(username+":"+age);
    return "ok";
}
//数组接收参数
@RequestMapping("/arrayParam")
public String arrayParam(String[] hobby){
    System.out.println(Arrays.toString(hobby));
    return "ok";
}
//使用集合来接收形参
@RequestMapping("/listParam")
public String listParam(@RequestParam List<String> hobby){
    //RequestParam是将参数名和集合对应起来，数组不用。
    System.out.println(hobby);
    return "ok";
}
//日期参数
@RequestMapping("/dateParam")
public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime){
    //DateTimeFormat格式化日期，前端传的日期格式必须一样，否则会报400
    System.out.println(updateTime);
    return "ok";
}

//json参数的传递方法
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
    System.out.println(user.getAge() + user.getName());
    return "ok";
}
//路径参数
@RequestMapping("/path/{id}")
public String pathParam(@PathVariable Integer id){
    //pathParam将形参和大括号里的路径绑定起来
    System.out.println(id);
    return "ok";
}

}
