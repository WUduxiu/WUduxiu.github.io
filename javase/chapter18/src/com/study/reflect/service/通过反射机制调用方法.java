package com.study.reflect.service;

import java.lang.reflect.Method;

/**
 * @date 2022/10/23&15:23
 */
public class 通过反射机制调用方法 {
    public static void main(String[] args)throws Exception {
        //正常调用方法
        UserService userService = new UserService();
        /*
        调用方法要素
        1.对象
        2.logIn方法名
        3.实参列表
        4.返回值
         */
        boolean result = userService.logIn("admin", "123456");
        System.out.println(result ? "登陆成功" : "登陆失败");
        //使用反射机制来调用方法
        Class users = Class.forName("com.study.reflect.service.UserService");
        Object user = users.newInstance();
        Method logIn = users.getDeclaredMethod("logIn", String.class, String.class);
                /*
        调用方法要素
        1.对象      user
        2.logIn方法名  logIn
        3.实参列表   "admin", "123456"
        4.返回值    invoke
         */
        Object invoke = logIn.invoke(user, "admin", "123456");
        Boolean loop  =(Boolean)invoke;
        System.out.println(loop ? "登录成功" : "登录失败");


    }
}
