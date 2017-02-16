package com.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by zhourh on 2/13/2017.
 */
@Aspect
public class MyInterceptor {

    @Pointcut("execution(* com.test.aop.impl.PersonServerImpl.*(..))")
    public void anyMethod() {//
    }

    @Before("anyMethod() && args(name)")
    public void doAccessCheck(String name) {
        System.out.println(name);
        System.out.println("Do access before.");
    }

    @AfterReturning("anyMethod()")
    public void doAfter() {
        System.out.println("Do access after.");
    }

    @After("anyMethod()")
    public void after() {
        System.out.println("Do final access");
    }

    @AfterThrowing("anyMethod()")
    public void doAfterthrow() {
        System.out.println("Do Exception");
    }

    @Around("anyMethod()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Do Around.");
        Object obj = pjp.proceed();
        System.out.println("Exit Around.");
        return obj;
    }

}
