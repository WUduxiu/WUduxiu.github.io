package com.study.super_;

public class A extends Base{
    public int n1;
    protected int n2;
    int n3;
    private int n4;
    public A(){
        System.out.println("无参构造器");
    }
    public A(String name){
        System.out.println("形参为String的父类构造器"+name);
    }
    public A(String name,int age){

    }
    public void test100(){
        System.out.println("public修饰的方法");
    }
    protected void test200(){

    }
    void test300(){

    }
    private void test400(){

    }
    public void cal(){
        System.out.println("A类中的cal()方法被调用.....");
    }
}
