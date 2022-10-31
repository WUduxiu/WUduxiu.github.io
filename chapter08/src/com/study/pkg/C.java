package com.study.pkg;

import com.study.modifier修饰符.A;

public class C {
    public void test(){
        A a = new A();
        //不同包 属性只有public能被访问  protected  private 默认修饰符都不可以访问
        System.out.println(a.n1);
        //不同包 方法只有public能被访问  protected  private 默认修饰符都不可以访问
        a.m1();
    }
}
