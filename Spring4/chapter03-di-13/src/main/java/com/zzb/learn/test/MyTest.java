package com.zzb.learn.test;


import com.zzb.learn.dao.Student;
import com.zzb.learn.dao.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;


public class MyTest {


    @Test
    public void test() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-base.xml","spring-bean.xml");
        String resource = "spring*.xml";
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(resource);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./spring-*.xml");

        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
        System.out.println("================================================");
        Teacher teacher = (Teacher) applicationContext.getBean("teacher");
        System.out.println(teacher);
    }
}
