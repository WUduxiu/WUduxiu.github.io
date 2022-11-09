package com.study.线程thread.面试题exam.exam4;

/**
 * @date 2022/10/21&21:10
 */
public class Test04 {
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
        需要等待
        因为静态方法是找类锁，类锁不管创建了几个对象，类锁只有一把 所以需要等待
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
    //synchronized  static 出现在静态方法上 找的是类锁
    public synchronized  static void  doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000*10);//休眠10s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }
    public synchronized static void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}
