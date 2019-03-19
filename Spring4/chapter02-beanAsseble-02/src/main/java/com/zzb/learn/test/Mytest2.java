package com.zzb.learn.test;


import com.zzb.learn.service02.ISomeService;
import com.zzb.learn.service02.SomeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;


public class Mytest2 {


    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/zzb/learn/service02/applicationContext.xml");
        ISomeService someService = (SomeServiceImpl) applicationContext.getBean("someService");
        someService.doSomething();
    }
}
