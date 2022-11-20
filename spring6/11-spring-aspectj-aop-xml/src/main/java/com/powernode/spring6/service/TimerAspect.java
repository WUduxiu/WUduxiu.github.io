package com.powernode.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @date 2022/11/4&21:41
 */
//计时切面
public class TimerAspect {
    //通知
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        long begin = System.currentTimeMillis();//前环绕
        joinPoint.proceed();//执行目标方法
        long end = System.currentTimeMillis();//后环绕
        System.out.println("耗时"+(end-begin)+"毫秒");
    }
}
