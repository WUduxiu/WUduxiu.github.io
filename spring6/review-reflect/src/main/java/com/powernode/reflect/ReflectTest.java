package com.powernode.reflect;

import java.lang.reflect.Method;

/**
 * @date 2022/10/31&17:16
 */
public class ReflectTest {
    //使用反射机制去调用方法
    public static void main(String[] args) throws Exception {
        //获取类
        Class clazz = Class.forName("com.powernode.reflect.SomeService");
        //获取方法
        Method doSomeMethod = clazz.getDeclaredMethod("doSome",String.class,int.class);
        //调用方法的四要素
        //调用那个对象的那个方法，传什么参数，返回什么结果
        //调用的对象 obj
        //调用对象的那个方法  doSomeMethod
        //传送什么参数 ”李四“  250
        //返回什么结果  result
        Object obj = clazz.newInstance();
        Object result = doSomeMethod.invoke(obj, "李四", 250);
        System.out.println(result);
    }
}
