package com.study.poly多态_.detail;

public class Animal {
    String name = "动物";
    int age = 10;
    public void sleep(){
        System.out.println("动物睡觉");
    }
    public void run(){
        System.out.println("动物奔跑");
    }
    public void eat(){
        System.out.println("动物进食");
    }
    public void show(){
        System.out.println("动物say hello");
    }

}
class Cat extends Animal{
    public void eat(){//方法的重写
        System.out.println("猫吃鱼");
    }
    public void eat1(){

    }
    public void catchMouse(){//Cat特有的方法
        System.out.println("猫抓老鼠");
    }
}
