package com.zzb.learn.test;


import com.zzb.learn.dao.Some;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;


public class MyTest {


    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Some mySome = (Some) applicationContext.getBean("mySome");
        System.out.println(mySome);
    }
}
