package com.zzb.learn.service01;

public class SomeServiceProxy implements ISomeService {
    private SomeServiceImpl someServiceImpl;

    public SomeServiceProxy() {
        someServiceImpl = new SomeServiceImpl();
    }

    @Override
    public void doFirst() {
        someServiceImpl.doFirst();
    }

    @Override
    public String doSecond() {
        return someServiceImpl.doSecond().toUpperCase();
    }
}
