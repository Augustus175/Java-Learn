package com.zzb.learn.test;


import com.zzb.learn.bean.Student;
import com.zzb.learn.service01.IStudentService;
import com.zzb.learn.service01.StudentServiceImpl;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Mytest {

    private IStudentService service;

    @BeforeTest
    public void before() {
        service = new StudentServiceImpl();
    }

    @Test
    public void test1() {
        Student student = new Student("张四", 20, 93.6);
        service.saveStudent(student);
    }


    @Test
    public void test6() {
        Map<String, Object> map = new HashMap<>();
        map.put("pname", "四");
        map.put("page", 23);
        Student student = new Student();
        student.setName("四");
        student.setAge(23);
        map.put("myStudent", student);
        List<Student> students = service.findStudentsByCondition(map);
        for (Student stu :
                students) {
            System.out.println(stu);
        }
    }

}
