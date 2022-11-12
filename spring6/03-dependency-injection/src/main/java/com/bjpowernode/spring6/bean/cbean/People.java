package com.bjpowernode.spring6.bean.cbean;

/**
 * @date 2022/10/29&20:31
 *   C命名空间是为了简化构造注入
 */
public class People {
    private String name;
    private int age;
    private boolean sex;
    //C命名空间是注入方法是基于构造方法的
    public People(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
