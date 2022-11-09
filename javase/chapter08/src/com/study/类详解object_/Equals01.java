package com.study.类详解object_;

public class Equals01 {
    public static void main(String[] args) {
        int i = 10;
        double d = 10.0;
        //==是一个比较运算符
        /*
        既可以判断基本类型，又可以判断引用类型
         */
        System.out.println(i==d);//此时判断的是数据的基本类型  看俩者的值是否相等
        A obj1 = new A();
        A obj2 = new A();
        A obj3 = obj1;
        A a = new B();
        B b = (B) a;

        //判断引用类型的时候，判断俩个对象地址是否相等，及判定是否为同一个对象
        System.out.println(obj1==obj2);//obj1和obj2不是同一个对象
        System.out.println(obj1==obj3);//obj1和obj3是同一个对象
        System.out.println(a==obj1);//f
        System.out.println(b==a);//t
        //equals方法，查看源码
        "hello".equals("abc");
    }
}
class A{

}
class B extends A{

}
