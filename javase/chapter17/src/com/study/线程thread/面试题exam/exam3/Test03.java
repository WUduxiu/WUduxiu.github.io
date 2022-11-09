package com.study.线程thread.面试题exam.exam3;

/**
 * @date 2022/10/21&21:10
 */
public class Test03 {
    public static void main(String[] args) throws InterruptedException {
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        MyThread t1 = new MyThread(mc1);
        MyThread t2 = new MyThread(mc2);
        t1.setName("t1");
        t1.start();
        t2.setName("t2");
        t2.start();
        t2.sleep(1000);//t2线程休眠一秒 保证t1线程先启动
        /*
        此时doOther方法的执行会等待doSome方法的结束吗？
        不需要需要等待
        因为此时t2线程的doOther方法用synchronized修饰了 里面共享的资源就是new MyThread(mc);里面的mc
        因为现在有两个对象引用 也就是只有两把锁，doSome占一把 doOther占一把 不需要等待
         */
    }


}

class MyThread extends Thread{
    private MyClass mc;

    public MyThread(MyClass mc) {
        this.mc = mc;
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("t1")){
            mc.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")){
            mc.doOther();
        }
    }
}

class MyClass{
    public synchronized void  doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000*10);//休眠10s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }
    public synchronized void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}
