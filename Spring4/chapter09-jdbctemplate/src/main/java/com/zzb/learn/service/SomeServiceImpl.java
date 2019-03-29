package com.zzb.learn.service;


public class SomeServiceImpl implements ISomeService {


    @Override
    public String doSomething() {
        System.out.println("run doSomething!");
        return "abc";
    }

    @Override
    public void doOther() {
        System.out.println("run doOther");
    }

    @Override
    public String doThird() {
        System.out.println("run doThird");
        return "def";
    }

    @Override
    public void doFourth() {
        System.out.println("run doFourth" + 1 / 0);
//        System.out.println("run doFourth");
    }
}
