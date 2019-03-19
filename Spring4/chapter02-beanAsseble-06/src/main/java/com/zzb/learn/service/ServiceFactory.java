package com.zzb.learn.service;

public class ServiceFactory {
    public static SomeServiceImpl getSomeService() {
        return new SomeServiceImpl();
    }
}
