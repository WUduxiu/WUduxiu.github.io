package com.powernode.spring6.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @date 2022/11/4&20:16
 */
@Component("logAspect")
@Aspect  //切面类是需要使用Aspect注解进行标注的
@Order(2)
public class LogAspect {//切面
    //切面 = 切点+通知
    //这里通知就是增强 就是具体要编写增强代码
    //这里通知Advice以方法的形式出现 (因为方法里面可以写代码)
    //@Before("execution(修饰符 返回值类型 全限定类名 方法名(形式参数列表) 异常)")   @@Before()  标志的方法就是前置通知通知了


    /*
       没有异常通知的顺序：   前环绕 前置通知 生成订单 后置通知 最终通知 后环绕
       有异常通知的顺序：     前环绕 前置通知 生成订单 异常通知  最终通知(因为相当于在finally语句块中执行所以一定会执行)
       当有异常通知时 后置通知和后环绕消失
     */

    @Pointcut("execution(* com.powernode.spring6.service..*(..))")
    public void commonCut(){//通用切点表达式   代码复用率提高
    }
    //前置通知
    @Before("commonCut()")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("前置通知");
        /*
        这个JoinPoint joinPoint 在spring容器调用这个方法的时候 自动传值过来
        我们可以直接使用   JoinPoint joinPoint的用法
         */
        Signature signature = joinPoint.getSignature();//返回一个方法的签名   public void generate()方法的这一部分叫做签名
        System.out.println("方法的签名:"+signature.getModifiers()+"\t"+signature.getDeclaringTypeName()+"\t"+signature.getName());

    }
    //后置通知
    @AfterReturning("commonCut()")
    public void afterReturningAdvice(){
        System.out.println("后置通知");
    }
    //环绕通知  是最大的范围  在前置之前  在后置之后
    @Around("commonCut()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        //前环绕的代码
        System.out.println("前环绕");
        //执行目标
        joinPoint.proceed();
        //后环绕
        System.out.println("后环绕");
    }
    //异常通知
    @AfterThrowing("commonCut()")
    public void afterThrowingAdvice(ProceedingJoinPoint joinPoint){
        System.out.println("异常通知");
    }


    //最终通知
    @After("commonCut()")
    public void afterAdvice(){
        System.out.println("最终通知");
    }
}
