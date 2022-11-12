package com.bjpowernode.spring6.bean.pbean;

import java.util.Date;

/**
 * @date 2022/10/29&20:16
 *    P命名空间是为了简化Set注入
 */
public class Dog {
    //简单类型
    private String name;
    private int age;
    //非简单类型(Date实际上是简单类型，但是一般都不当成简单类型使用)
    private Date date;
    //p命名空间注入，底层实际上还是set注入，只不过p命名空间注入让Spring配置变得更简单
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
