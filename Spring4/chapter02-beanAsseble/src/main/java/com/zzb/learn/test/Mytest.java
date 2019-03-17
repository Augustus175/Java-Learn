package com.zzb.learn.test;


import com.zzb.learn.service.ISomeService;
import com.zzb.learn.service.SomeServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.testng.annotations.Test;


public class Mytest {

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISomeService someService = (SomeServiceImpl) applicationContext.getBean("someService");
        someService.doSomething();
    }
}
