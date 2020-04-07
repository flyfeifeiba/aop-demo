package com.example.aopdemo.module.advice;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @ClassName LoggerAdvice
 * @Description 日志切面
 * @Author
 * @Date 2020/3/31 19:38
 * @Version 1.0
 */
public class LoggerAdvice {

    public void doAround(ProceedingJoinPoint pjp) throws Throwable {
        //获取方法名
        Signature signature = pjp.getSignature();
        Object[] args = pjp.getArgs();

        if (args != null && args.length != 0 ) {

            System.out.println("[Aspect2]around test 1,LoggerAdvice," + "执行方法:" + signature.getName() + "参数：" + JSON.toJSONString(args));
        }
        pjp.proceed();
        System.out.println("[Aspect2]around test 2");

    }

    private void doBefore(JoinPoint pjp) throws Throwable {

        System.out.println("[Aspect2]before test");

    }
//    private void doBefore1(JoinPoint pjp) throws Throwable {
//
//        System.out.println("[Aspect2]before test1");
//
//    }

}
