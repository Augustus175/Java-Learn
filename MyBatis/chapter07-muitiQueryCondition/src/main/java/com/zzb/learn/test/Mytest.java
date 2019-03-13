package com.zzb.learn.test;


import com.zzb.learn.bean.Student;
import com.zzb.learn.service.IStudentService;
import com.zzb.learn.service.StudentServiceImpl;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
        List<Student> students = service.findStudentsByCondition("四", 23);
        for (Student student :
                students) {
            System.out.println(student);
        }
    }

}
