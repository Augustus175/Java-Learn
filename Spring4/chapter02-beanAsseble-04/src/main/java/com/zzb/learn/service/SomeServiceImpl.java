package com.zzb.learn.service;


public class SomeServiceImpl implements ISomeService {


    @Override
    public String doSomething() {
        System.out.println("run doSomething!");
        return "abc";
    }

    @Override
    public void doOther() {
        System.out.println("run doOther!");
    }
}
