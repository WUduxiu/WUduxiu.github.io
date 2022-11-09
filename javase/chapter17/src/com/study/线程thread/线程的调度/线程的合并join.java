package com.study.线程thread.线程的调度;

/**
 * @date 2022/10/21&16:32
 */
public class 线程的合并join {
    public static void main(String[] args) throws Exception {
        System.out.println("main begin");
        Thread t = new Thread(new MyRunnable3());
        t.setName("t");
        t.start();
        t.join();//将t线程合并到main线程 此时main线程受到阻塞，要等t线程完成才能解除阻塞状态
        //在内存中，t线程的栈并没有消失，俩个线程发生了等待关系
        System.out.println("main over");
    }
}
class MyRunnable3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
