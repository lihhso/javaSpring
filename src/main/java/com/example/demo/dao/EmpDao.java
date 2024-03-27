package com.example.demo.dao;

import com.example.demo.pojo.Emp;

import java.util.List;

public interface EmpDao {
    //获取员工雷表数据
    public List<Emp> empList();
}
