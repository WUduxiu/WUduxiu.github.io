package com.study.抽象类abstract_;

public class AbstractDetail01 {
    public static void main(String[] args) {
        //new A(); 抽象类无法实例化
    }
}
//抽象类不一定要有抽象方法，也可以有实现的方法
abstract class A{
    public void saiHi(){
        System.out.println("Hi");
    }
}
//一旦一个类有了抽象方法就要将这个类声明为抽象类
abstract class B{
    //public abstract int a = 1; abstract只能修饰类和方法不能修饰属性和其他的
    public abstract void sayHi();//抽象方法没有方法体
}
