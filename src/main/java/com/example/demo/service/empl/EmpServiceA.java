package com.example.demo.service.empl;

import com.example.demo.dao.EmpDao;
import com.example.demo.dao.impl.EmpDaoA;
import com.example.demo.pojo.Emp;

import java.util.List;

public class EmpServiceA implements com.example.demo.service.EmpService {

    private EmpDao empDao = new EmpDaoA();
    @Override
    public List<Emp> listEmp() {
        List<Emp> empList = empDao.empList();
        empList.stream().forEach(emp -> {
            String gender = emp.getGender();
            if ("1".equals(gender)){
                emp.setGender("男");
            }else if ("2".equals(gender)){
                emp.setGender("女");
            }

            String job = emp.getJob();
            if ("1".equals(job)){
                emp.setJob("讲师");
            }else if ("2".equals(job)){
                emp.setGender("班主任");
            }else if ("3".equals(job)) {
                emp.setGender("就业指导");
            }
        });
        return empList;
    }
}
