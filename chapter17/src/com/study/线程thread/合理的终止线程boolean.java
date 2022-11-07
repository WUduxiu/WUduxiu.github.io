package com.study.线程thread;

import jdk.nashorn.internal.ir.IfNode;

/**
 * @date 2022/10/20&22:27
 *      如何合理地终止一个线程
 */
public class 合理的终止线程boolean {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable4 r = new MyRunnable4();
        Thread t = new Thread(r);
        t.setName("t1");
        t.start();
        Thread.sleep(1000*5);//5s后结束进程
        r.loop = false;

    }
}
class MyRunnable4 implements Runnable{
     boolean loop = true;
    @Override
    public void run() {
            for (int i = 0; i < 10; i++) {
                if (loop){
                    System.out.println(Thread.currentThread().getName()+"--->"+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("程序终止");
                    return;//跳出当前方法 跳出for循环
                }
        }
    }
}

