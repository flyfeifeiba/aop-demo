package com.example.aopdemo.module.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhouying
 * @Date: 2020/4/1 22:00
 * @Description:
 */
@Component
@Aspect
public class TransactionAspect implements Ordered {

//    @Before(value = "execution(* com.example.aopdemo.module.service.*.*(..))")
//    public void before(JoinPoint joinPoint) {
//        System.out.println("[Aspect1] before advise");
//    }

//    @Around(value = "execution(* com.example.aopdemo.module.service.*.*(..))")
//    public void around(ProceedingJoinPoint pjp) throws  Throwable{
//        System.out.println("[Aspect1] around advise 1");
//        pjp.proceed();
//        System.out.println("[Aspect1] around advise2");
//    }

//    @AfterReturning(value = "execution(* com.example.aopdemo.module.service.*.*(..))")
//    public void afterReturning(JoinPoint joinPoint) {
//        System.out.println("[Aspect1] afterReturning advise");
//    }
//
//    @AfterThrowing(value = "execution(* com.example.aopdemo.module.service.*.*(..))")
//    public void afterThrowing(JoinPoint joinPoint) {
//        System.out.println("[Aspect1] afterThrowing advise");
//    }
//
//    @After(value = "execution(* com.example.aopdemo.module.service.*.*(..))")
//    public void after(JoinPoint joinPoint) {
//        System.out.println("[Aspect1] after advise");
//    }

    @Override
    public int getOrder() {
        return 0;
    }
}
