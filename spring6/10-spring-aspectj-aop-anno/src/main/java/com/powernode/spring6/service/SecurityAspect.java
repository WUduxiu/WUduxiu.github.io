package com.powernode.spring6.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @date 2022/11/4&21:06
 */
@Aspect
@Component
@Order(1)  //给切面进行排序  里面的数字越小 优先级越高
public class SecurityAspect {//安全切面
    //通知 加  切点
    //在不同的类下 使用同一个通用切点 前面加上类的全路径
    @Before("com.powernode.spring6.service.LogAspect.commonCut()")
    public void beforeAdvice(){
        System.out.println("前置通知：安全切面");
    }

}
