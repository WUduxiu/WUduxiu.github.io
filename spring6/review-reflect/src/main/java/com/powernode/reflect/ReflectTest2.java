package com.powernode.reflect;

import java.lang.reflect.Method;

/**
 * @date 2022/10/31&17:29
 */
public class ReflectTest2 {
    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("com.powernode.reflect.SomeService");
        //获取方法
        Method method = clazz.getDeclaredMethod("doSome");
        //获取对象
        Object o = clazz.newInstance();
        //调用方法
        method.invoke(o);
       // System.out.println(invoke);  该方法没有返回值  不需要返回值
    }
}
