package com.study.静态方法static_;

public class VisitStatic {
    public static void main(String[] args) {
        //调用方法：类名.类变量名
        //类变量是随着类的加载而创建的，并不依赖于对象实例
        System.out.println(A.name);
        A a = new A();
        //通过对象名.类变量名
        System.out.println(a.name);
    }
}
class A{
    //类变量的访问权限和之前一样
    public static String name = "xiaoming";
}
