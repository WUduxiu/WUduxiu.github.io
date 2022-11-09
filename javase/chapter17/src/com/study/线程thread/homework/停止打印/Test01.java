package com.study.线程thread.homework.停止打印;

import java.util.Scanner;

/**
 * @date 2022/10/24&9:20
 */
public class Test01 {
    public static void main(String[] args) {
        A a = new A();
        Thread thread = new Thread(a);
        Thread thread1 = new Thread(new A1(a));
        thread1.start();
        thread.start();


    }

}
class A implements Runnable{
    boolean loop =true;

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {

        while (loop){
            System.out.println((int) (Math.random()*100) +1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("打印停止");
    }
}
class A1 implements Runnable{
    private A a;

    public A1(A a) {
        this.a = a;
    }

    Scanner scanner = new Scanner(System.in);
    @Override
    public void run() {
        while (true){
            System.out.println("请输入Q停止线程1");
            char c = scanner.next().charAt(0);
            if (c=='Q'){
                a.setLoop(false);
            }
            System.out.println("停止线程1成功");
            break;
        }

    }
}
