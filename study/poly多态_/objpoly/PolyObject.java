package com.study.poly多态_.objpoly;

public class PolyObject {
    public static void main(String[] args) {
        Animal animal = new Animal();//编译类型是Animal  运行类型也是Animal
        Animal dog = new Dog();//编译类型是Animal  运行类型也是Dog
        Animal cat = new Cat();//编译类型是Animal  运行类型也是Cat
        animal.cry();
        dog.cry();
        cat.cry();
    }
}
class Animal{
    public void cry(){
        System.out.println("Animal喊叫");
    }
}
class Dog extends Animal{
    public void cry(){
        System.out.println("Dog喊叫");
    }
}
class Cat extends Animal{
    public void cry(){
        System.out.println("Cat喊叫");
    }
}
