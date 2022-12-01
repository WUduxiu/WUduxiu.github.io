package com.powernode.reflect;

import com.powernode.annotation.Component;

/**
 * @date 2022/11/1&15:58
 */
public class ReflectAnnotationTest1 {
    //通过反射机制 反射注解
    //获取类
    public static void main(String[] args)throws Exception {
        Class<?> aClass = Class.forName("com.powernode.bean.User");
        //判断类上有没有注解
        //判断aClass这个类上有没有 Component这个注解
        if (aClass.isAnnotationPresent(Component.class)) {
            //获取注解
            Component annotation = aClass.getAnnotation(Component.class);
            //访问注解属性
            System.out.println(annotation.value());
        }
    }
}
