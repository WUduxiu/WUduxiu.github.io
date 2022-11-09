package com.study.reflect;

/**
 * @date 2022/10/23&16:09
 */
public class 通过反射知道类的父类及其实现的接口信息 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("java.lang.String");
        //获取String的父类
        Class superclass = c.getSuperclass();
        System.out.println(superclass);
        //获取String类实现的所有接口(一个类可以实现多个接口)
        Class[] interfaces = c.getInterfaces();
        for (Class aClass :interfaces) {
            System.out.println(aClass);
        }


    }
}
