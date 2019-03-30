package com.zzb.learn.test;


import com.zzb.learn.beans.Student;
import com.zzb.learn.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MyTest {

    private IStudentService studentService;

    @BeforeTest
    public void before() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        studentService = (IStudentService) applicationContext.getBean("studentService");
    }

    @Test
    public void test() {
        Student  student = new Student("张三",23);
        studentService.saveStudent(student);
    }
}
