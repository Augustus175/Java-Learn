package com.zzb.learn.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/*
 *  Bean后处理器会自动由容器执行，在容器中其它Bean初始化完毕之前和之后自动调用
 *  执行Bean后处理器的两个方法
 * 
 
public class MyBeanPostProcessor implements BeanPostProcessor {

	
	 * 该方法会在其它Bean初始化完毕之前先执行
	 * 该方法的返回值为当前正在初始化的对象
	 * bean：是当前正在初始化的对象 
	 * beanName：是当前正在初始化的对象的id
	 * 该方法会在其他bean初始化完成之前先执行
	 * 该方法的返回值为当前正在执行的初始化对象
	 * bean:是当前正在初始化的对象
	 * BeanName 是当前正在初始化的对象的id
	 
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("执行---Before---()方法");
		return bean;
	}

	
	 * 该方法会在其它Bean初始化完毕之后执行
	 * 该方法的返回值为当前正在初始化的对象
	 * 该方法会在其他bean初始化完毕之后执行
	 * 该方法的返回值为当前正在初始化的对象
	 * 
	 * 
	 * 
	 * 返会的对象为功能被增强和扩展的对象
	 * 重要的功能是可以指定增强的bean
	 
	@Override
	public Object postProcessAfterInitialization(final Object bean, String beanName)
			throws BeansException {
		System.out.println("执行---After---()方法");
		Object proxy = Proxy.newProxyInstance(
				bean.getClass().getClassLoader(), 
				bean.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						Object invoke = method.invoke(bean, args);
						if(invoke != null && "doSome".equals(method.getName())) {
							invoke = ((String)invoke).toUpperCase();
						}
						return invoke;
					}
				});
		return proxy;
	}

}*/

public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(final Object bean, String beanName)
            throws BeansException {

        Object proxy = bean;
        if ("someService".equals(beanName)) {
            proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {

                @Override
                public Object invoke(Object proxy, Method method, Object[] args)
                        throws Throwable {
                    Object invoke = method.invoke(bean, args);

                    if (invoke != null && method.getName().equals("doSomething")) {
                        invoke = ((String) invoke).toUpperCase();
                    }
                    return invoke;
                }
            });
        }

        return proxy;
    }


}


























