package com.study.poly多态_.多态入门poly;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("小明");
        Dog dog = new Dog("黄狗");
        Bone bone = new Bone("大排骨");
        master.feed(dog,bone);
        Cat cat = new Cat("橘猫");
        Fish fish = new Fish("黄花鱼");
        master.feed(cat,fish);
        Food food = new Rice("米饭");
        Pig pig = new Pig("猪");
        master.feed(pig,food);
    }
}
