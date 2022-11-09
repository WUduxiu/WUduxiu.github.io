package com.study.线程thread;

/**
 * @date 2022/10/20&21:06
 *  关于线程的sleep方法
 *   static void sleep(long millis)
 *   1.静态方法
 *   2.参数是毫秒
 *   3.作用：让当前线程进入休眠，进入”阻塞状态“，放弃占用cpu时间片，让给其他线程使用
 *      这行代码，出现在那个线程 那个线程就进入休眠
 *
 */
public class 线程的阻塞状态Sleep01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
            try {
                Thread.sleep(1000);//睡眠一秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
