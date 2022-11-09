package com.study.代码块codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        A a = new A();//1.创建对象实例的时候
        A a1 = new A();
        new B();//2.创建子类对象实例，父类也会被加载  而且父类先被加载，子类后被加载
        System.out.println(C.n);//3.使用类的静态成员时（类的静态属性，静态方法） 如果有继承关系的话先加载父类
    }

}
class A{
    static {
        System.out.println("A类的静态代码块被调用");
    }
    {
        System.out.println("A类的普通代码块被调用");
    }
}
class B extends A{
    public static int a = 10;
    /*
    static 代码块随着类的加载而执行，并且只会执行一次
    类什么时候会被加载
    1.创建对象实例的时候
    2.创建子类对象实例，父类也会被加载  而且父类先被加载，子类后被加载
    3.使用类的静态成员时（类的静态属性，静态方法）
    普通代码块，每创建一个对象，就会执行一次
     */
    static {
        System.out.println("B类的静态代码块被调用");
    }
}
class C extends A{
    public static int n = 10;
    static {
        System.out.println("C的静态代码块被调用");
    }
    public static void test(){
        System.out.println("调用了C类的静态方法");
    }
}
