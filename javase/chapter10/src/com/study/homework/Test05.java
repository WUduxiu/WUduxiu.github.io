package com.study.homework;

import com.study.抽象类abstract_.抽象类设计模板.B;

/**
 * @date 2022/10/8&11:12
 */
public class Test05 {
    public static void main(String[] args) {
        A a = new A();
        a.test();
    }
}
class A{
    private final String NAME = "TOM";
    public void test(){
        class B{
            private final String NAME = "JACK";
            public void show(){
                System.out.println("局部内部类的属性"+NAME);
                System.out.println("外部类的属性"+A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }
}
