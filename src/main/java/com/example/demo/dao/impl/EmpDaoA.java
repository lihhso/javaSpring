package com.example.demo.dao.impl;

import com.example.demo.dao.EmpDao;
import com.example.demo.pojo.Emp;
import com.example.demo.until.XmlParserUtils;

import java.util.List;

public class EmpDaoA implements EmpDao
{
    @Override
    public List<Emp> empList() {
        //动态加载解析XML文件
        String file=this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        //将xml文件的数据解析到Emp对象中，并且使用集合empList接收
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
