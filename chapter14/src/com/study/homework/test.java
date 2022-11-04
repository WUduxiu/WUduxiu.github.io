package com.study.homework;

/**
 * @date 2022/10/17&9:19
 */
public class test {
    public static void main(String[] args) {
        B b = new B();

        A a = (A) b;

        C c = (C) b;
        System.out.println(c.getI());//动态绑定




    }
}

interface A {
    int a = 10;

}

class B extends C implements A{
    int b = 30;
    public int getI(){
        return 30;
    }
}
class C {
    int c = 20;
    public int getI(){
        return 20;
    }
}

