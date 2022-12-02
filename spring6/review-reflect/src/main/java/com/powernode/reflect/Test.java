package com.powernode.reflect;

/**
 * @date 2022/10/31&17:09
 */
public class Test {
    public static void main(String[] args) {
        /*
        调用对象的四要素
        1.调用那个对象
        2.调用那个对象的那个方法
        3.调用对象的时候传递什么参数
        4.返回什么结果
        一句话：调用那个对象的那个方法，传什么参数，返回什么结果
        使用反射机制去调用方法也需要这个四个要素
         */
        SomeService someService = new SomeService();
        someService.doSome();
        String s1 = someService.doSome("张三");
        System.out.println(s1);
        String s2 = someService.doSome("李四", 250);
        System.out.println(s2);

    }
}
