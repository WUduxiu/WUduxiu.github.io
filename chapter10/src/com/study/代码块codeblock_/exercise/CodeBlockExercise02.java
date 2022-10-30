package com.study.代码块codeblock_.exercise;

public class CodeBlockExercise02 {
    public static void main(String[] args) {
        Test a = new Test();
    }
}
class Sample{
    Sample(String s){
        System.out.println(s);
    }
    Sample(){
        System.out.println("Sample默认构造器被调用");
    }
}
class Test{
    {
        System.out.println("Test类的普通代码块");
    }
    Sample sam1 = new Sample("sam1普通成员初始化");//普通属性初始化
    static Sample sam = new Sample("静态成员初始化");//静态属性初始化
    static {
        System.out.println("static代码块执行");
        if (sam == null){
            System.out.println("sam is null");
        }
    }
    Test(){
        System.out.println("Test默认构造器被调用");
    }

}
