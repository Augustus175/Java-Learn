package com.zzb.learn.test;


import com.zzb.learn.service.ISomeService;
import com.zzb.learn.service.SomeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;


public class Mytest4 {


    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISomeService someService = (ISomeService) applicationContext.getBean("someService");
        System.out.println(someService.doSomething());
        System.out.println(someService.doOther());
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
