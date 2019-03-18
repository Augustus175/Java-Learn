package com.zzb.learn.service02;

public class ServiceFactory {
    public  static SomeServiceImpl getSomeService() {
        return new SomeServiceImpl();
    }
}
