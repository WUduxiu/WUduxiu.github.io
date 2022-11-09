package com.study.线程thread.面试题exam.exam2;

/**
 * @date 2022/10/21&21:10
 */
public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        MyClass mc = new MyClass();
        MyThread t1 = new MyThread(mc);
        MyThread t2 = new MyThread(mc);
        t1.setName("t1");
        t1.start();
        t2.setName("t2");
        t2.start();
        t2.sleep(1000);//t2线程休眠一秒 保证t1线程先启动
        /*
        此时doOther方法的执行会等待doSome方法的结束吗？
        需要等待
        因为此时t2线程的doOther方法用synchronized修饰了 里面共享的资源就是new MyThread(mc);里面的mc
        因为只有一个对象引用 也就是只有一把锁，只有等doSome方法执行完毕，将锁放出来 doOther方法才可以执行
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
