package com.study.线程thread;

/**
 * @date 2022/10/20&19:42
 * 采用匿名内部类 实现线程
 */
public class 实现线程Thread03 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("分支线程---》"+i);
                }
            }
        });
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程-》"+i);
        }

    }
}
