package com.study.线程thread;

/**
 * @date 2022/10/20&20:06
 * 1.怎么获取线程对象
 *  Thread currentThread = Thread.currentThread();
 * 2.获取线程对象的名字   t1.getName()
 * 3.修改线程对象的名字   t1.setName("分支线程");
 * 4.当线程没有设置名字时，默认线程的名字 Thread-0   Thread-1  逐渐增加(从0开始)
 */
public class 获取线程对象Thread01 {
    public static void main(String[] args) {
        //创建线程对象
        MyThread2 t1 = new MyThread2();
        //获取当前线程对象
        //这个代码出现在main()方法中，所以当前线程就是主线程
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());//获取当前线程的名字
        //设置线程的名字
        //t1.setName("分支线程");
        //获取线程的名字
        String name = t1.getName();//默认线程的名字 Thread-0
        System.out.println(name);
        //启动线程
        t1.start();
        MyThread2 t2 = new MyThread2();
        System.out.println(t2.getName());
        t2.start();
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(currentThread.getName()+"----->"+i);
        }
    }
}
