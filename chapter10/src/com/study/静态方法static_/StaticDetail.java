package com.study.静态方法static_;

public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
        //System.out.println(B.n1);  实例变量不能通过类名.类变量名访问
        System.out.println(B.n2);
        //静态变量是类加载的时候，就创建了，所以我们没有创建对象实例的时候就可以使用了
        //通过类名.类变量来调用
        //类表量随着类的销毁而销毁
        System.out.println(C.name);
    }
}
class B{
    public int n1 = 100;
    public static int n2 = 200;
}
class C{
    public static String name = "jack";
}
