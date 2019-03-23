package com.zzb.learn.service;


public class SomeServiceImpl implements ISomeService {


    @Override
    public  String doSomething(){
        System.out.println("run doSomething!");
        return "abc";
    }
}
