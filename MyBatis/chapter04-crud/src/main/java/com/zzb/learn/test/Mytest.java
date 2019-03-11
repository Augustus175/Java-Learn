package com.zzb.learn.test;


import com.zzb.learn.bean.Student;
import com.zzb.learn.service.IStudentService;
import com.zzb.learn.service.StudentServiceImpl;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;


public class Mytest {

    private IStudentService service;

    @BeforeTest
    public void before() {
        service = new StudentServiceImpl();
    }

    @Test
    public void test1() {
        Student student = new Student("张三", 23, 93.6);
        service.saveStudent(student);
    }

    @Test
    public void test2() {
        Student student = new Student("张三", 23, 93.6);
        System.out.println("before insert student is: " + student);
        service.saveStudentCatchId(student);
        System.out.println("after insert student is: " + student);
    }

    @Test
    public void test3() {
        service.removeStudentById(16);
    }

    @Test
    public void test4() {
        Student student = new Student("张三", 23, 98.3);
        student.setId(15);
        service.modifyStudent(student);
    }

    @Test
    public void test5() {
        final List<Student> allStudents = service.findAllStudents();
        for (Student student :
                allStudents) {
            System.out.println(student);
        }
    }

    @Test
    public void test6() {
        Student student = service.findStudentById(15);
        System.out.println(student);
    }
}
