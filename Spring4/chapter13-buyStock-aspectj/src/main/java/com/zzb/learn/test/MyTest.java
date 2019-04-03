package com.zzb.learn.test;


import com.zzb.learn.service.IBuyStockService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MyTest {

    private IBuyStockService service;

    @BeforeTest
    public void before() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        service = (IBuyStockService) applicationContext.getBean("buyStockService");
    }

    @Test
    public void test01() {
        service.openAccount("张三", 1000);
        service.openStock("Tmall", 0);
    }

    @Test
    public void test02() {
        try {
            service.buyStock("张三", 1000, "Tmall", 5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

