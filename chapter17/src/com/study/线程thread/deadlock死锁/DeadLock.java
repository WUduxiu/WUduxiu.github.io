package com.study.线程thread.deadlock死锁;

/**
 * @date 2022/10/21&21:51
 * synchronized在开发中不要嵌套使用  可能不小心就陷入死锁
 */
public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
        Object o1 = new Object();
        Object o2 = new Object();
        MyThread01 t1 = new MyThread01(o1, o2);
        MyThread02 t2 = new MyThread02(o1, o2);
        t1.setName("t1");
        t2.setName("t2");
        t2.start();
        t1.start();






    }
}
class MyThread01 extends Thread{
    Object obj1;
    Object obj2;

    public MyThread01(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
//此时就发生了死锁现象
    @Override
    public void run() {
        //使用了synchronized修饰的代码块 需要将代码块执行完毕才能解锁
        //这里解锁的条件是 先解锁obj2 再解锁 obj1
        //线程t1在拿到obj1的资源后 陷入休眠  线程2在拿到obj2的资源后陷入休眠
        //此时线程解锁1的条件是拿到 obj2的资源 但是下面的线程2解锁的条件是拿到obj1的资源
        //线程1无法释放obj1的资源导致线程2无法解锁  线程2无法释放obj2的资源导致线程1无法解锁 于是陷入死锁
        synchronized (obj1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj2){

            }
        }
        System.out.println("线程t1结束");
    }
}
class MyThread02 extends Thread{
    Object obj1;
    Object obj2;

    public MyThread02(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    @Override
    public void run() {
        synchronized (obj2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj1){

            }
        }
        System.out.println("线程t2结束");
    }
}
