package com.zzb.learn.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {
    @Before("execution(* *..ISomeService.doSomething(..))")
    public void myBefore() {
        System.out.println("#runing the before()#");
    }

    @Before("execution(* *..ISomeService.doSomething(..))")
    public void myBefore(JoinPoint jp) {
        System.out.println("#runing the before(joinPoint) " + jp + "#");
    }

    @AfterReturning(value = "execution(* *..ISomeService.doSomething(..))", returning = "result")
    public String myAfterReturning(String result) {
        System.out.println("#runing the afterReturning#");
        return result.toUpperCase();
    }

    @Around(value = "execution(* *..ISomeService.doThird(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("run myAround before");
        Object proceed = pjp.proceed();
        if (proceed != null) {
            proceed = ((String) proceed).toUpperCase();
        }
        System.out.println("run myAround after");
        return proceed;
    }

    @AfterThrowing(value = "execution(* *..ISomeService.doFourth(..))")
    public void afterThrowing() {
        System.out.println("run afterThrowing");
    }
}
