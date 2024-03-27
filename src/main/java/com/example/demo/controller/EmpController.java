package com.example.demo.controller;

import com.example.demo.pojo.Emp;
import com.example.demo.pojo.Result;
import com.example.demo.service.EmpService;
import com.example.demo.service.empl.EmpServiceA;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    private EmpService empService = new EmpServiceA();
    @RequestMapping("/listEmp")
    public Result list(){
        //调取empService中获得的数据
        List<Emp> empList = empService.listEmp();

        //响应数据
        return Result.success(empList);
    }
}



//    //动态加载解析XML文件
//    String file=this.getClass().getClassLoader().getResource("emp.xml").getFile();
//        System.out.println(file);
//                //将xml文件的数据解析到Emp对象中，并且使用集合empList接收
//                List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
//        //对数据进行转换
//        empList.stream().forEach(emp -> {
//        String gender = emp.getGender();
//        if ("1".equals(gender)){
//        emp.setGender("男");
//        }else if ("2".equals(gender)){
//        emp.setGender("女");
//        }
//
//        String job = emp.getJob();
//        if ("1".equals(job)){
//        emp.setJob("讲师");
//        }else if ("2".equals(job)){
//        emp.setGender("班主任");
//        }else if ("3".equals(job)) {
//        emp.setGender("就业指导");
//        }
//        });
//
//        //响应数据
//        return Result.success(empList);
//        }
