package com.zzb.learn.service;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdviser implements ThrowsAdvice {

    public void afterThrowing(Exception ex) {
        System.out.println("-------running the ThrowsAdviser!-------");
    }
}
