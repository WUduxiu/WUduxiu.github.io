package com.study.extend_继承;

public class Base extends TopBase {//父类
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    public int getN4(){
        return n4;
    }
    public Base(){
        super();
        System.out.println("父类的无参构造器Base()...被调用");
    }
    //不写构造器的话 会生成一个默认的无参构造器，当写了一个有参构造器时 会将原有自带的默认无参构造器覆盖
    public Base(String name){
        System.out.println("父类的有参构造器Base(String name)...被调用");
        System.out.println(name);
    }
    public void test100(){
        System.out.println("public修饰符");
    }
    protected void test200(){
        System.out.println("protected修饰符");
    }
    void test300(){
        System.out.println("默认修饰符");
    }
    private void test400(){
        System.out.println("private修饰符");
    }
    public void callTest400(){
        test400();
        System.out.println("通过父类提供的共有方法来调用private修饰的方法");
    }
}
