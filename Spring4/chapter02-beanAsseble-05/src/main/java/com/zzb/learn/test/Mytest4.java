package com.zzb.learn.test;


import com.zzb.learn.service.ISomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;


public class Mytest4 {


    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISomeService someService = (ISomeService) applicationContext.getBean("someService");
//        SomeServiceImpl someService = (SomeServiceImpl) applicationContext.getBean("someService");
        System.out.println(someService.doSomething());
        System.out.println(someService.doOther());
        ISomeService someService1 = (ISomeService) applicationContext.getBean("someService1");
        System.out.println(someService1.doSomething());
        System.out.println(someService1.doOther());
    }
}
