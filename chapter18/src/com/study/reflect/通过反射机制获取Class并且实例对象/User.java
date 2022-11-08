package com.study.reflect.通过反射机制获取Class并且实例对象;

/**
 * @date 2022/10/22&16:03
 */
public class User {
    public User() {
        System.out.println("User 的无参构造方法");
    }
    public User(String name){
        System.out.println("User 的有参构造方法");
    }
}
