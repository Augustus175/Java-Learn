package com.zzb.learn.service01;


public class MyTest {
    public static void main(String[] args) {
        ISomeService someServiceProxy = new SomeServiceProxy();
        someServiceProxy.doFirst();
        String result = someServiceProxy.doSecond();
        System.out.println("result : " + result);
    }
}
