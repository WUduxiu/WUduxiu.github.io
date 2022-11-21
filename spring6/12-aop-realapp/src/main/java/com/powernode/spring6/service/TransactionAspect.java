package com.powernode.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @date 2022/11/4&22:33
 */
@Component
@Aspect
public class TransactionAspect {  //切面
    //编程式事务解决方案
    @Around("execution(* com.powernode.spring6.service..*(..))")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("开启事务"); //执行前环绕
            joinPoint.proceed(); //执行目标
            System.out.println("提交事务");
        } catch (Throwable e) {
            System.out.println("回滚事务");

        }

    }
}
