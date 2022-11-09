package com.study.extend_继承;

public class ExtendsDetail {
    public static void main(String[] args) {
        Sub sub = new Sub();
        //先调用父类的无参构造器  完成父类的无参构造器的初始化
        //再调用子类的构造器
        System.out.println("第二个对象------------");
        Sub sub1 = new Sub("123");
        //sub.sayOk();
    }
}
