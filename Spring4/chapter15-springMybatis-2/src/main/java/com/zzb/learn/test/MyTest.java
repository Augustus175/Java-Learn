package com.zzb.learn.test;


import com.zzb.learn.beans.Student;
import com.zzb.learn.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;


public class MyTest {

    private IStudentService studentService;

    @BeforeTest
    public void before() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        studentService = (IStudentService) applicationContext.getBean("studentService");
    }

    @Test
    public void test1() {
        Student student = new Student("李二", 21);
        studentService.saveStudent(student);
    }

    @Test
    public void test2() {
        List<Student> students = studentService.findAllStudents();
        for (Student student :
                students) {
            System.out.println(student);
        }
    }
}
