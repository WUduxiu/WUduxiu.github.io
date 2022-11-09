package com.study.代码块codeblock_;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        BBB bbb = new BBB();

    }
}
class AAA{
    {
        System.out.println("AAA的普通代码块被调用");
    }
    public AAA(){
        System.out.println("AAA的无参构造器被调用");
    }
}
class BBB extends AAA{
    {
        System.out.println("BBB的普通代码块被调用");
    }
    public BBB(){
        //隐藏了1.super()
        //隐藏了2.调用BBB类的普通代码块
        System.out.println("BBB的无参构造器被调用");
    }
}
