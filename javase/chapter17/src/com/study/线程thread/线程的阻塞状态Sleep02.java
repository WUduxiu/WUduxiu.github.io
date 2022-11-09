package com.study.线程thread;

/**
 * @date 2022/10/20&21:19
 */
public class 线程的阻塞状态Sleep02 {
    public static void main(String[] args) throws Exception{
        String name = "main主线程";
        MyThread03 t = new MyThread03();
        //这时使 分支线程进入休眠
        //Thread t = new MyThread03();(多态)  这是不会使分支线程进入休眠 而是使main线程休眠
        System.out.println("main线程解除阻塞状态1");
        t.sleep(1000*5);//因为sleep()方法是一个静态方法 实际上还是调用 Thread.sleep()
        //调用的就是当前线程 main()
        t.start();
        //5秒之后 main线程接触阻塞状态
        for (int i = 0; i < 1000; i++) {
            System.out.println("main线程解除阻塞状态2");//当休眠结束以后 此时main线程和分支线程开始抢夺时间片
        }



    }
}
class MyThread03 extends Thread{
    static String name = "分支线程";
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
