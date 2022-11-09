package com.study.线程thread.生产者和消费者wait和notify;

/**
 * @date 2022/10/22&14:43
 */
public class homework {
    public static void main(String[] args) {
        Num num = new Num(0);
        Thread t1 = new Thread(new A(num));
        t1.setName("t1");
        Thread t2 = new Thread(new B(num));
        t2.setName("t2");
        t1.start();
        t2.start();

    }
}
class Num{
    int i;

    public Num(int i) {
        this.i = i;
    }
}
class A implements Runnable{
    private Num num;

    public A(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true){
            synchronized (num){
                if (num.i%2!=0){
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                num.notifyAll();
                System.out.println(Thread.currentThread().getName()+"--->"+(++num.i));
            }
        }
    }
}
class B implements Runnable{
    private Num num;

    public B(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true){
            synchronized (num){
                if (num.i%2==0){
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                num.notifyAll();
                System.out.println(Thread.currentThread().getName()+"--->"+(++num.i));
            }

        }
    }
}
