package com.study.modifier修饰符;


public class B {
    public void say() {
        A a = new A();
        //B和A是在同一个包下  属性只能访问public  protected  默认修饰符
        System.out.println(a.n1+" "+a.n2+" "+a.n3);
        //方法只能访问public  protected  默认修饰符
        a.m1();
        a.m2();
        a.m3();
    }
}

