package com.study.抽象类abstract_.抽象类设计模板;

public class B extends Template{
    public static void main(String[] args) {
        B b = new B();
        b.calculate();
    }
    @Override
    public void job() {
        for (int i = 0; i < 2000000000; i++) {
            num += i;
        }
    }

    @Override
    public void calculate() {
        super.calculate();
    }
}
