package com.study.reflect.annotation;

/**
 * @date 2022/10/23&16:59
 */
public @interface MyAnnotation01 {
    /**
     *我们通常在注解中可以定义属性，以下是MyAnnotation的name属性
     * 看着像一个方法 但实际上我们称之为name属性
     */
    String name();//名字属性
    String color();//颜色属性
    int age() default 25;//指定年龄属性默认值
}
