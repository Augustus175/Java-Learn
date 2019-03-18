package com.zzb.learn.service04;

public class ServiceFactory {
    public SomeServiceImpl getSomeService() {
        return new SomeServiceImpl();
    }
}
