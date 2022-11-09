package com.study.reflect.annotation.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @date 2022/10/23&17:56
 */
@Target(ElementType.TYPE)
//该注解只能出现在类上
@Retention(RetentionPolicy.RUNTIME)
//该注解可以被反射机制读取
public @interface Id {

}
//这个注解@Id用来标注的类，被标注的类必须有一个int类型的id属性，没有的话就会报异常
