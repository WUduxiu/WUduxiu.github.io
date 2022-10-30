package com.study.代码块codeblock_.exercise;

public class CodeBlockExercise01 {
    public static void main(String[] args) {
        /*
        调用类的属性和方法完成类的加载
        类加载的时候只会调用一次static代码块
        先是完成public static int total = 100;但是没有输出值所以就会先输出代码块里的内容
        因为只会调用一次static代码块所以只执行一次 total++；
         */
        System.out.println("total = "+ Person.total);//101
        System.out.println("total = " + Person.total);//101
    }
}
class Person{
    public static int total = 100;
    static {
        total++;
        System.out.println("in static block");
    }
}

