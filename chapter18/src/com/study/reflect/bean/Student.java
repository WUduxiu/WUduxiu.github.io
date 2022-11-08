package com.study.reflect.bean;

/**
 * @date 2022/10/22&21:18
 * 反射filed
 */
public class Student {
    //filed翻译为字段的意思，其实就是属性/成员变量
    //定义4个属性 分别采用不同的访问修饰符
    public int no;
    private String name;
    private int age;
    boolean sex;
    public static final double MATH_PI = 3.1415;

    public Student() {
    }
}
