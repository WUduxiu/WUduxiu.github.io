package com.bjpowernode.spring6.bean;

/**
 * @date 2022/10/28&20:47
 */
public class User {
    //set注入属性(简单类型)
    private String name;//String 是简单类型
    private int age;//int 也是简单类型
    private String password;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
