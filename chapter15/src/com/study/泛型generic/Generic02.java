package com.study.泛型generic;

import java.util.ArrayList;

/**
 * @date 2022/10/16&19:59
 */
public class Generic02 {
    public static void main(String[] args) {
        /*
        1.当我们  ArrayList<Dog> dogs = new ArrayList<>();表示存放到 ArrayList 集合中的元素是Dog类型
        2.如果编译器发现添加的类型，不满足要求就会报错
        3.在遍历的时候可以直接取出  Dog类
         */
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("小黄",2));
        dogs.add(new Dog("大黄",3));
        //dogs.add(new Pig("猪",3));
        for (Dog o :dogs) {
            System.out.println(o.getName()+"-"+o.getAge());
        }

    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
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
}
class Pig{
    private String name;
    private int age;

    public Pig(String name, int age) {
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
}
