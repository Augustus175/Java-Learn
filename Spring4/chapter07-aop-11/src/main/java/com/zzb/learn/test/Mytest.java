package com.zzb.learn.test;


import com.zzb.learn.service.ISomeService;
import com.zzb.learn.service.SomeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class Mytest {
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISomeService someServiceProxy = (ISomeService) applicationContext.getBean("someService");
        someServiceProxy.doSomething();
        someServiceProxy.doOther();
        someServiceProxy.doThird();
    }

}
