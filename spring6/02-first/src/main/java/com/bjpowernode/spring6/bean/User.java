package com.bjpowernode.spring6.bean;

/**
 * @date 2022/10/27&23:06
 * 这是一个Bean，封装了用户的信息，Spring可以帮我们
 */
public class User {
    //spring是如何实例化对象的
    /*
    默认情况下Spring会通过反射，调用类的无参构造器来实例化对象
    原理如下
    Class class = Class.forName("类的全名（带包名）")
    通过 class的 newInstance()方法创造一个对象
    Object obj = class.newInstance()
     */
    //如果定义了有参构造器的情况下没有 显示的定义无参构造器则会抛出异常
    // nested exception is java.lang.NoSuchMethodException: com.bjpowernode.spring6.bean.User.<init>()
    public User(String s) {
    }

    public User() {
        System.out.println("User的无参数构造方法执行");
    }
}
