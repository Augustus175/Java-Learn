package com.zzb.learn.service;

public class ServiceFactory {
    public SomeServiceImpl getSomeService() {
        return new SomeServiceImpl();
    }
}
