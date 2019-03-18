package com.zzb.learn.service01;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyDynamicProxyTest {
    public static void main(String[] args) {
        final ISomeService target = new SomeServiceImpl();
        ISomeService serviceProxy = (ISomeService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args)
                            throws Throwable {
                        Object result = method.invoke(target, args);
                        if (result != null) {
                            result = ((String) result).toUpperCase();
                        }
                        return result;
                    }
                }
        );
        String result = serviceProxy.doSecond();
        serviceProxy.doFirst();
        System.out.println("result : " + result);

    }
}
