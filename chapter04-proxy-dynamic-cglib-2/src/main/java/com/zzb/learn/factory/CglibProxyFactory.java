package com.zzb.learn.factory;

import com.zzb.learn.service.ISomeService;
import com.zzb.learn.service.SomeServiceImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory implements MethodInterceptor {
    private ISomeService target;

    public CglibProxyFactory() {
        target = new SomeServiceImpl();
    }

    public ISomeService myCglibCreator() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ISomeService.class);
        enhancer.setCallback(this);
        return (ISomeService) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects,
                            MethodProxy methodProxy) throws Throwable {
        Object result = method.invoke(target, objects);
        if (result != null) {
            result = ((String) result).toUpperCase();
        }
        return result;
    }
}
