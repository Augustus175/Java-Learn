package com.zzb.learn.test;


import com.zzb.learn.service.ISomeService;
import com.zzb.learn.service.SomeService;
import com.zzb.learn.service.SomeServiceImpl;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class Mytest {
    @Test
    public void test1() {
        ISomeService target = new SomeServiceImpl();
        ISomeService someService = (ISomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        SomeService.doTx();
                        Object invoke = method.invoke(target, args);
                        SomeService.doLog();
                        return invoke;
                    }
                });
        someService.doSomething();

    }

}
