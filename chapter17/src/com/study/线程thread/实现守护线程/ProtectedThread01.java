package com.study.线程thread.实现守护线程;

/**
 * @date 2022/10/21&22:39
 * 守护线程
 */
public class ProtectedThread01 {
    public static void main(String[] args) throws Exception {
        BakData bakData = new BakData();
        bakData.setName("t1");
        bakData.setDaemon(true);//将t线程设置为守护线程
                                //当用户线程main线程结束 t线程(守护线程)也会结束
        bakData.start();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
class BakData extends Thread{
    int i = 0;
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--->"+(++i));
        }

    }
}
