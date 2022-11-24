package com.powernode.interfacetest;

/**
 * @date 2022/11/19&16:33
 */
public class A implements C{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C a2 = new B();
    }
}
class B implements C{}
interface C{}
