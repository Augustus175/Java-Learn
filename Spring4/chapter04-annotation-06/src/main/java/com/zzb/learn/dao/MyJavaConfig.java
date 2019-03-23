package com.zzb.learn.dao;


import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyJavaConfig {
    //    @Bean(name = "student",autowire = Autowire.BY_NAME)
    @Bean(name = "student", autowire = Autowire.BY_TYPE, initMethod = "beanBefore", destroyMethod = "beanAfter")
    public Student getStudent() {
        return new Student("zhangsan", 23);
    }

    @Bean(name = "mySchool")
    public School getSchool() {
        return new School("TingHua");
    }
}
