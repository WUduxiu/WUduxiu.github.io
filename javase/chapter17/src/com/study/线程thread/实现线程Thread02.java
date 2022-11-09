package com.study.线程thread;

/**
 * @date 2022/10/20&19:31
 * 实现线程的第二种方式，编写一个类实现java.lang.Runnable接口
 */
public class 实现线程Thread02 {
    public static void main(String[] args) {
        //创建一个可运行的类
       // MyRunnable myRunnable = new MyRunnable();
        //将可运行的类，封装成一个线程对象
        //Thread thread = new Thread(myRunnable);
        //调用 start()方法  启动线程
        //合并代码
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程----》"+i);
        }
    }
}
class MyRunnable implements Runnable{//此时该类还不是一个线程，只是一个可运行的类

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("线程分支---》"+i);
        }
    }
}
