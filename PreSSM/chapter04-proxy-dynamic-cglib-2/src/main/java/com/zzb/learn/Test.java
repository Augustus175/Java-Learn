package com.zzb.learn;

import com.zzb.learn.factory.CglibProxyFactory;
import com.zzb.learn.service.ISomeService;

public class Test {
    public static void main(String[] args) {
        ISomeService someService = new CglibProxyFactory().myCglibCreator();
        String result = someService.doSecond();
        someService.doFirst();
        System.out.println("result : " + result);
    }
}
