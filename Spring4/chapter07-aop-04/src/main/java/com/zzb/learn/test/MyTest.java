package com.zzb.learn.test;


import com.zzb.learn.service.ISomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;


public class MyTest {

    private int age = 0;
    private String name ;

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISomeService someServiceProxy = (ISomeService) applicationContext.getBean("someServiceProxy");
        String result = someServiceProxy.doSomething();
        int age = 0;
        System.out.println(age);
        System.out.println(result);
        System.out.println(age);
        System.out.println(result);

    }
}
