package com.study.reflect.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @date 2022/10/23&17:30
 */
public class 反射机制读取注解 {
    public static void main(String[] args)throws Exception {
        //获取类上有这个注解的类
        Class c = Class.forName("com.study.reflect.annotation.MyAnnotationTest03");
        //判断类上是否有注解
        System.out.println(c.isAnnotationPresent(使用元注解写自定义注解.class));
        if (c.isAnnotationPresent(使用元注解写自定义注解.class)){
            使用元注解写自定义注解 annotation = (使用元注解写自定义注解) c.getAnnotation(使用元注解写自定义注解.class);
            System.out.println("类上的注解为"+annotation);
            //获取注解上的属性
            String vlaue = annotation.value();
            System.out.println(vlaue);
        }
        Method doSome = c.getDeclaredMethod("doSome");
        if (doSome.isAnnotationPresent(使用元注解写自定义注解.class)){
            使用元注解写自定义注解 annotation = doSome.getAnnotation(使用元注解写自定义注解.class);
            System.out.println(annotation.username());
            System.out.println(annotation.password());
            System.out.println(annotation.value());
        }
        //判断String类上是否有该注解
        Class s = Class.forName("java.lang.String");
        System.out.println(s.isAnnotationPresent(使用元注解写自定义注解.class));
    }
}
