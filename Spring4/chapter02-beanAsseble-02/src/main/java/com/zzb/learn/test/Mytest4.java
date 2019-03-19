package com.zzb.learn.test;


import com.zzb.learn.service.ISomeService;
import com.zzb.learn.service.SomeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;


public class Mytest4 {


    @Test
    public void test4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/zzb/learn/service04/applicationContext.xml");
        ISomeService someService = (SomeServiceImpl) applicationContext.getBean("someService");
        someService.doSomething();
    }
}
