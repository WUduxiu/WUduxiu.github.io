package com.study.线程thread;

/**
 * @date 2022/10/20&17:48
 * 实现线程的第一种方式
 *   1.编写一个类，直接继承java.lang.Thread 重写run()方法
 *   2.创建线程对象
 *   3.调用线程对象的start()方法
 */
public class 实现线程Thread01 {
    public static void main(String[] args) {
        //这里是main方法，这里的代码属于主线程，在主栈中运行
        //新建一个分线程对象
        MyThread myThread = new MyThread();
        //start()方法的作用：启动一个分支线程，在JVM中开辟一个新空间，这段代码任务完成后，瞬间就结束了
        //这段代码的任务，只是为了开启一个新的栈空间，只要新的栈空间开辟出来了，start()方法就结束了。线程就启动成功了
        //启动成功了线程就会自动调用run()方法，并且run()方法在分支栈的底部(压栈)
        //run()方法在分支栈的底部，main()方法在主栈的底部 run()和main()是平级的
        myThread.start();//如果不调用这个方法 直接调用run()方法 还是单线程 并没有并发  自动调用run()方法
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程---》"+i);
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程启动----》"+i);
        }
    }
}
