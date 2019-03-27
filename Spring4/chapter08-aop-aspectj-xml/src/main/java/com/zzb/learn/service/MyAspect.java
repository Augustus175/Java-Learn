package com.zzb.learn.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {
    //    @Before("execution(* *..ISomeService.doSomething(..))")
    public void myBefore() {
        System.out.println("#runing the before()#");
    }

    //    @Before("execution(* *..ISomeService.doSomething(..))")

    public void myBefore(JoinPoint jp) {
        System.out.println("#runing the before(joinPoint) " + jp + "#");
    }

    //    @AfterReturning(value = "execution(* *..ISomeService.doSomething(..))", returning = "result")
    public String myAfterReturning(Object result) {
        System.out.println("#runing the afterReturning#");
        return ((String) result).toUpperCase();
    }

    public void myAfterReturning() {
        System.out.println("#runing the afterReturning without args#");
    }

    //    @Around("myPoinCut()")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("run myAround before");
        Object proceed = pjp.proceed();
        if (proceed != null) {
            proceed = ((String) proceed).toUpperCase();
        }
        System.out.println("run myAround after");
        return proceed;
    }

    //    @AfterThrowing(value = "execution(* *..ISomeService.doFourth(..))")
    public void afterThrowing() {
        System.out.println("run afterThrowing");
    }

    //    @Pointcut("execution(* *..ISomeService.doThird(..))")
    private void myPoinCut() {
    }
}
