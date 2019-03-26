package com.zzb.learn.service;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) {
        System.out.println("------------do before call----------------");
        Object result = null;
        try {
            result = invocation.proceed();
            if (result != null) {
                result = ((String) result).toUpperCase();
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("------------do after call----------------");
        return result;
    }
}
