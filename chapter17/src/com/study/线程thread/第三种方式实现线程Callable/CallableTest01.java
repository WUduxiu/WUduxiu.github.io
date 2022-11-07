package com.study.线程thread.第三种方式实现线程Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;//JUC包下，属于Java的并发包，JDK8新特性 以前的jdk没有这个包

/**
 * @date 2022/10/22&13:11
 * 线程的第三种实现方式
 *  实现Callable接口
 *  优点：可以拿到另一个线程的执行结果
 *  缺点：效率比较低，在获取另一个线程的结果时 get() 可能会导致 当前线程受阻塞
 *
 */
public class CallableTest01 {
    public static void main(String[] args) throws Exception {
        //1.创建一个“未来任务类对象”
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("call begin");
                Thread.sleep(1000*10);
                System.out.println("call over");
                int a = 10;
                int b = 10;
                return a+b; //自动装箱 返回的是(Integer)
            }
        });//参数是一个接口 可以使用匿名内部类
        //创建线程对象
        Thread t = new Thread(task);
        //启动线程
        t.start();
        //此时这里是主线程main 如何在主线程中得到t线程返回的值
        /*
        main 线程这里的程序要想执行结束，必须等待get()方法的结束
        而get()方法可能需要好久，因为get()方法拿了另一个线程的执行结果
        而另一个线程执行是需要时间的
         */
        Object o = task.get();//get()方法可能会导致当前线程阻塞
        System.out.println("得到的结果"+task.get());
        System.out.println("main 方法结束");
    }
}
