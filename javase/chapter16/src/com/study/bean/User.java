package com.study.bean;

import java.io.Serializable;

/**
 * @date 2022/10/20&11:20
 */
public class User implements Serializable {
    private transient String name;//transient关键字表示游离的，不参与序列化
                                //反序列化后该属性的值为默认值 null
    private int age;
    private static final long serialVersionUID = 2L;//自定义版本序列号
    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
