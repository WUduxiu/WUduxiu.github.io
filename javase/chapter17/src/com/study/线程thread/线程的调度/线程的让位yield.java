package com.study.线程thread.线程的调度;

/**
 * @date 2022/10/21&16:24
 */
public class 线程的让位yield {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("t");
        t.start();
        for (int i = 1; i <= 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }
    }
}
class MyRunnable2 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
            if (i % 100 ==0){
                Thread.yield();//每100t线程暂停，让位为main线程
            }
        }
    }
}
