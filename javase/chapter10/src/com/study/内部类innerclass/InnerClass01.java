package com.study.内部类innerclass;

public class InnerClass01 {//其他外部类
    public static void main(String[] args) {

    }
}
/*
类的五大属性：属性、方法、构造器、代码块、内部类
 */
class Outer{//外部类
    private String name;//属性
    public void hi(){//方法

    }

    public Outer(String name) {//构造器
        this.name = name;
    }
    {//代码块
        System.out.println("Outer对象被创建");
    }
    class Inner{//内部类

    }
}
