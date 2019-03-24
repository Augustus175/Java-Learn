package com.zzb.learn.service;


public class SomeServiceImpl implements ISomeService {


    @Override
    public  String doSomething(){
        System.out.println("run doSomething!"+ 1/0);
        return "abc";
    }
}
