package com.study.线程thread.线程的调度;

/**
 * @date 2022/10/21&16:06
 */
public class 线程的优先级 {
    public static void main(String[] args) {
        System.out.println("线程的最高优先级"+Thread.MAX_PRIORITY);
        System.out.println("线程的最低优先级"+Thread.MIN_PRIORITY);
        System.out.println("线程的默认优先级"+Thread.NORM_PRIORITY);
        //获取当前线程
        Thread thread = Thread.currentThread();
        Thread.currentThread().setPriority(1);//设置main线程的优先级为1
        Thread t = new Thread(new MyRunnable());
        t.setName("t");
        //优先级高的，只是抢到的CPU时间片相对多一些
        // (并不是谁先完成 后完成的问题，是指运行状态时间多少的问题)
        //大概率方向更偏向优先级高的
        t.setPriority(10);//设置t线程的优先级为10
        t.start();
        //获取当前线程的名字和优先级
        for (int i = 0; i < 1000; i++) {
            System.out.println(thread.getName()+ "线程的默认优先级为: "+thread.getPriority());
        }

    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"线程的默认优先级为: "+Thread.currentThread().getPriority());
        }

    }
}
