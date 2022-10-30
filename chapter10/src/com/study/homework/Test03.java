package com.study.homework;

/**
 * @date 2022/10/8&10:46
 */
public class Test03 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shout();
        Dog dog = new Dog();
        dog.shout();
    }
}
abstract class Animal{//抽象类里面的方法要用abstract修饰  接口不用
   public abstract void shout();
}
class Cat extends Animal{

    @Override
    public void shout() {
        System.out.println("猫叫");
    }
}
class Dog extends Animal{

    @Override
    public void shout() {
        System.out.println("狗叫");
    }
}
