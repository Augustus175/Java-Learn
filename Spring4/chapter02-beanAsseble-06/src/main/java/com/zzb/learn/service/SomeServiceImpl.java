package com.zzb.learn.service;


public class SomeServiceImpl implements ISomeService {


    @Override
    public String doSomething() {
        System.out.println("run doSomething!");
        return "abc";
    }

    @Override
    public String doOther() {
        System.out.println("run doOther!");
        return "def";
    }

    public void initAfter() {
        System.out.println("==do initAfter==");
    }

    public void initDestroy() {
        System.out.println("==do initDestroy==");
    }
}
