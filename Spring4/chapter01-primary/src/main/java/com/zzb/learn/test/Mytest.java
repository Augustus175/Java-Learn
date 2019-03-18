package com.zzb.learn.test;


import com.zzb.learn.service01.ISomeService;
import com.zzb.learn.service01.SomeServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.testng.annotations.Test;


public class Mytest {
    @Test
    public void test1() {
        ISomeService someService = new SomeServiceImpl();
        someService.doSomething();
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISomeService someService = (SomeServiceImpl) applicationContext.getBean("someServiceImpl");
        someService.doSomething();
    }

    @Test
    public void test3() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("applicationContext.xml");
        ISomeService someService = (SomeServiceImpl) applicationContext.getBean("someServiceImpl");
        someService.doSomething();
    }

    @Test
    public void test4() {
//        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("applicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        ISomeService someService = (SomeServiceImpl) beanFactory.getBean("someServiceImpl");
        someService.doSomething();
    }
}
