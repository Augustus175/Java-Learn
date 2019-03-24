package com.zzb.learn.test;


import com.zzb.learn.service.ISomeService;
import com.zzb.learn.service.UserException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;


public class MyTest {


    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISomeService someServiceProxy = (ISomeService) applicationContext.getBean("someServiceProxy");
        String result = someServiceProxy.doSomething();
        System.out.println(result);
        try {
            someServiceProxy.chckUser("Beijing","1121");
        } catch (UserException e) {
            e.printStackTrace();
        }
    }
}
