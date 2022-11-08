package com.study.reflect.annotation;

/**
 * @date 2022/10/23&17:27
 */
@使用元注解写自定义注解(value = "指定value的值",username = "admin",password = "123456")
public class MyAnnotationTest03 {
    //@使用元注解写自定义注解 '@使用元注解写自定义注解' not applicable to field
    String name;
    @使用元注解写自定义注解( username = "admin",password = "123")
    public void doSome() {
       // @使用元注解写自定义注解   '@使用元注解写自定义注解' not applicable to local variable
        String name;
    }

    public static void main(String[] args) {

    }
}
