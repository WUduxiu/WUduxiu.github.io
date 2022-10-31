package com.study.HomeWork;

public class Test14 {
    public static void main(String[] args) {
        C c = new C();
    }
}
class A{
    public A(){
        System.out.println("我是A类的无参构造");
    }
}
class B extends A{
    public B(){
        System.out.println("我是B类的无参构造");
    }
    public B(String name){
        super();//有一个默认的super()方法
        System.out.println(name+"我是B类的有参构造");
    }
}
class C extends B{
    public C(){
        this("hello");
        System.out.println("我是C类的无参构造");
    }
    public C(String name){
        super("hhh");
        System.out.println(name);//hello
        System.out.println("我是C类的有参构造");
    }
}
