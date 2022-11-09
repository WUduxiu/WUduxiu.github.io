package com.study.线程thread;

/**
 * @date 2022/10/20&21:56
 * 如何唤醒正在休眠的线程
 */
public class 唤醒线程的阻塞状态interrupt01 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("t");
        t.start();
        //希望5s之后t线程醒来
        try {
            Thread.sleep(1000*5);//假设5s之后 唤醒t线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();//利用异常处理机制 java.lang.InterruptedException: sleep interrupted
        // 使代码进入catch代码块中 打印异常信息 从而执行下面的代码
    }
}
class MyRunnable2 implements Runnable{

    @Override
    public void run() { //run()方法里面只能try-catch 处理异常
        System.out.println(Thread.currentThread().getName()+"---->"+"begin");
        //这边因为是重写了实现了接口，重写了接口里面的方法
        //父类并没有抛出异常，子类不能比父类抛出更多异常 所以只能try-catch 处理异常
        try {
            Thread.sleep(1000*60*10);//休眠十分钟
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"---->"+"end");
    }
}
