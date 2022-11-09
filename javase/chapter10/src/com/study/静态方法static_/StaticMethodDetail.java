package com.study.静态方法static_;

public class StaticMethodDetail {
    public static void main(String[] args) {
        D.hi();//
        new D().hello();
    }
}
class D{
    public int n1 = 100;
    public static int n2 = 200;
    public void hello(){
        //普通的方法既可以访问普通变量（方法）也可以访问静态变量（方法）
        System.out.println(this.n1);
        System.out.println(this.n2);
        this.hi();
    }
    public static void hi(){
        //类方法中不允许使用和对象有关的的关键字，比如this  super
        //super();
        //System.out.println(this.n1);
        //System.out.println(n1); 静态方法只能访问静态变量或者静态方法
        System.out.println(n2);
    }

}
