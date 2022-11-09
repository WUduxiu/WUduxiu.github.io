package com.study.super_;

public class Base {
    public int n1 = 99;
    public int age = 99;
    public Base(){
        System.out.println("Bsae类的无参构造器被创建");
    }
    public void cal(){
        System.out.println("Base类中cal()方法被调用");
    }
    public void eat(){
        System.out.println("Base类的eat()方法被调用");
    }
}
