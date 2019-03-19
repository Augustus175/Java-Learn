package com.zzb.learn.test;


import com.zzb.learn.service01.ISomeService;
import com.zzb.learn.service01.SomeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;


public class Mytest {

    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/zzb/learn/service01/applicationContext.xml");
        ISomeService someService = (SomeServiceImpl) applicationContext.getBean("someService");
        someService.doSomething();
    }
}
