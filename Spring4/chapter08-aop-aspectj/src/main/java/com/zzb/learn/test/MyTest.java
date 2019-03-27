package com.zzb.learn.test;


import com.zzb.learn.service.ISomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;


public class MyTest {


    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISomeService someServiceProxy = (ISomeService) applicationContext.getBean("someService");
        System.out.println(someServiceProxy.doSomething());
        System.out.println(someServiceProxy.doThird());
        someServiceProxy.doFourth();
    }
}
