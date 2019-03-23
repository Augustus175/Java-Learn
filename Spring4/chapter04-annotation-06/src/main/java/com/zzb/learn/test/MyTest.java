package com.zzb.learn.test;


import com.zzb.learn.dao.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;


public class MyTest {


    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
