package com.study.抽象类abstract_.抽象类设计模板;

public class A extends Template{
    public static void main(String[] args) {
        A a = new A();
        a.calculate();
    }
    @Override
    public void job() {
        for (int i = 0; i < 1000000000; i++) {
            num += i;
        }
    }

    @Override
    public void calculate() {
        super.calculate();
    }
}
