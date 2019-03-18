package com.zzb.learn.service01;

public class SomeServiceImpl implements ISomeService {
    @Override
    public void doFirst() {
        System.out.println("doFirst run !");
    }

    @Override
    public String doSecond() {
        System.out.println("doSecond run !");
        return "abcd";
    }
}
