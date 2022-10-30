package com.study.代码块codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        /*
        创建一个对象时，在一个类调用顺序是
        1.调用静态代码块和静态属性初始化(静态代码块和静态属性初始化的调用级别一样，如果有多个则按他们定义顺序来调用)
        2.普通代码块和普通属性优先级一致，如果有有多个也按照他们的定义顺序来调用
        3.调用构造器
         */
        AA aa = new AA();
    }
}
class AA{
    public AA(){
        System.out.println("AA的无参构造器被调用");
    }
    {
        System.out.println("AA类的普通代码1块被执行");
    }
    private int n2 = getN2();
    {
        System.out.println("AA类的普通代码2块被执行");
    }
    static {
        System.out.println("AA类的静态代码块1被执行");
    }
    static{
        System.out.println("BB类的静态代码块2被执行");
    }
    public static int n = getN();
    public static int getN(){
        System.out.println("getN()方法被调用");
        return 10;
    }
    public int getN2(){
        System.out.println("getN2()方法被调用");
        return 200;
    }
}
