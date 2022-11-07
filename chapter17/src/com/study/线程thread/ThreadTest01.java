package com.study.线程thread;

/**
 * @date 2022/10/20&17:38
 * 在该程序中
 * 只有一个线程(因为程序只有一个栈)
 *
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        System.out.println("main() begin");
        m1();
        System.out.println("main() over");
    }

    private static void m1() {
        System.out.println("m1() begin");
        m2();
        System.out.println("m1() over");
    }

    private static void m2() {
        System.out.println("m2() begin");
        m3();
        System.out.println("m2() over");
    }

    private static void m3() {
        System.out.println("m3() begin");
        System.out.println("m3() over");
    }
}
