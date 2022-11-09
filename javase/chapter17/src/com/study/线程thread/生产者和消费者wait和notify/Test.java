package com.study.线程thread.生产者和消费者wait和notify;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/10/22&13:50
 * 模拟一个需求
 *      仓库采用List集合 List集合只能存储一个元素
 *      1个元素表示仓库满了  0个元素表示仓库空了
 *      保证List集合中永远最多存储一个元素
 *      必须做到生产一个消费一个
 */
public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        Thread t1 = new Thread(new Producer(list));
        t1.setName("生产者线程");
        t1.start();
        Thread t2 = new Thread(new Consumer(list));
        t2.setName("消费者线程");
        t2.start();
    }
}
class Producer implements Runnable{
    private List list;//模拟仓库

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        //死循环 模拟一直生产
        while (true){
            synchronized (list){
                if (list.size()>0){
                    try {
                        list.wait();//生产线程进行等待 并释放之前抢到的锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object o = new Object();
                list.add(o);
                System.out.println(Thread.currentThread().getName()+"生产了"+o);
                list.notifyAll();
                /*
                唤醒在list上等待的线程  唤醒之后就会释放锁因为synchronized(list)代码块执行完毕了
                唤醒消费者线程消费 就算生产者线程再次抢到list的资源锁  因为list.size()>0还是会进入等待
                如此消费者线程必定会抢到list资源锁 因为list.size()>0 必定进行消费
                 */
            }


        }
    }
}
//消费者线程
class Consumer implements Runnable {
    private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        //死循环 模拟一直消费
        while (true) {
            synchronized (list) {//给仓库list加上锁
                if (list.size() == 0) {
                    try {
                        list.wait();//消费线程进入等待 并释放之前抢到的锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object remove = list.remove(0);
                System.out.println(Thread.currentThread().getName() + "消费了" + remove);
                list.notifyAll();//唤醒在list上等待的线程
            }
        }

    }
}

