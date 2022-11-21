package com.powernode.spring6.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date 2022/11/4&22:58
 */
@Component
@Aspect
public class SecurityLogAspect {  //安全日志切面
    //定义切点
    @Pointcut("execution(* com.powernode.spring6.biz..save*(..))")
    public void savePointcut() {

    }

    @Pointcut("execution(* com.powernode.spring6.biz..delete*(..))")
    public void deletePointcut() {

    }

    @Pointcut("execution(* com.powernode.spring6.biz..modify*(..))")
    public void modifyPointcut() {

    }

    @Before("savePointcut() || deletePointcut() || modifyPointcut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        //获取系统时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTime = sdf.format(new Date());
        //输出日志信息
        System.out.println(nowTime + "  zhangsan: " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());

    }
}
