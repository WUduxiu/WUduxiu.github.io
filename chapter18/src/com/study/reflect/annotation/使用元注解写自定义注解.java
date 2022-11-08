package com.study.reflect.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @date 2022/10/23&17:23
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/*
@Target({ElementType.TYPE,ElementType.METHOD})   @Retention(RetentionPolicy.RUNTIME)
表示这个自定义注解只能出现在类 和 方法上面
还表示该注解能被反射机制读取
 */
public  @interface 使用元注解写自定义注解 {
        String value() default "默认的value属性值";
        String username();
        String password();
}
