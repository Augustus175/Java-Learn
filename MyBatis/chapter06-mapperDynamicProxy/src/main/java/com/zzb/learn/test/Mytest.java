package com.zzb.learn.test;


import com.zzb.learn.bean.Student;
import com.zzb.learn.service01.IStudentService;
import com.zzb.learn.service01.StudentServiceImpl;
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
        Student student = new Student("张三", 21, 98.3);
        student.setId(1);
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
        Student student = service.findStudentById(1);
        System.out.println(student);
    }

    @Test
    public void test7() {
        List<Student> students = service.findStudentByName("四");
        for (Student student :
                students) {
            System.out.println(student);
        }
    }
}
