package com.study.poly多态_.exercise_;

public class PolyExercise02 {
    public static void main(String[] args) {
        Base base = new Sub();//在堆中是Sub对象
        base.base();//sub
        Sub sub = (Sub) base;
        //和属性相关的看左边的编译类型 输出编译类型的属性
        System.out.println(sub.count);//20
        //只能调用编译类型的公共方法 但是先从运行类型开始寻找方法
        sub.display();//20
        Base b = sub;
        System.out.println(b==sub);//true
        System.out.println(b.count);//10
        b.display();//20
    }
}
class Base{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
    public void base(){
        System.out.println("base()方法被调用");
    }
}
class Sub extends Base{
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }
    public void base(){
        System.out.println("sub()方法被调用");
    }
}
