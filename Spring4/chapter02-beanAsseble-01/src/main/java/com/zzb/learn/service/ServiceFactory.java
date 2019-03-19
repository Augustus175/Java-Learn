package com.zzb.learn.service01;

public class ServiceFactory {
    public SomeServiceImpl getSomeService() {
        return new SomeServiceImpl();
    }
}
