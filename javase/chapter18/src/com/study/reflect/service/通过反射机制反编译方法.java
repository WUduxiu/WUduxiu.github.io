package com.study.reflect.service;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;

/**
 * @date 2022/10/23&14:59
 */
public class 通过反射机制反编译方法 {
    public static void main(String[] args) throws Exception {
        //获取类
        StringBuilder s = new StringBuilder();
        Class serviceMethod = Class.forName("com.study.reflect.service.UserService");
        //类信息
        s.append(Modifier.toString(serviceMethod.getModifiers())+" class "+serviceMethod.getSimpleName()+" {\n");
        Method[] methods = serviceMethod.getDeclaredMethods();
        //public boolean logIn(String username, String password)
        for (Method method :methods) {
            s.append("\t");
            s.append(Modifier.toString(method.getModifiers())+" ");//拿到修饰符
            s.append(method.getReturnType().getSimpleName()+" ");//方法的返回值类型
            s.append(method.getName()+"(");//方法名
            Class<?>[] parameterTypes = method.getParameterTypes();//方法形参类型
            for (Class aClass :parameterTypes) {
                s.append(aClass.getSimpleName());
                s.append(",");
            }
            if (parameterTypes.length>0){
                s.deleteCharAt(s.length()-1);
            }

            s.append("){}");
            s.append("\n");
        }

        s.append("}");
        System.out.println(s);
        Object service = serviceMethod.newInstance();


    }
}
