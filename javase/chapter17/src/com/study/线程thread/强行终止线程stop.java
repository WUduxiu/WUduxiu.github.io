package com.study.线程thread;

/**
 * @date 2022/10/20&22:17
 *  在java中怎么强行终止一个线程
 *   t.stop() 这种方式存在很大的缺点：容易丢失数据
 *   因为这种方式是直接将 线程杀死 线程没有保存的数据将会丢失，不建议使用
 */
public class 强行终止线程stop {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new MyRunnable3());
        t.setName("t");
        t.start();
        Thread.sleep(1000*5);//假设5秒之后完成main线程任务
        //5s之后强行终止t线程
        t.stop();//方法已过时 不建议使用
    }
}
class MyRunnable3 implements Runnable{

    @Override
    public void run() {
        //让线程打印一个信息就睡眠一秒 需要十秒完成
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
