package com.study.线程thread.homework.ticket;

/**
 * @date 2022/10/24&8:39
 */
public class SellTicket {
    //多个线程共享 票数
    private Ticket ticket;

    public SellTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    public static void main(String[] args) {
        Ticket ticket = new Ticket(100);
        MyThread02 t1 = new MyThread02(ticket);
        t1.setName("窗口1");
        Thread t2 = new Thread(new MyThread01(ticket));
        t2.setName("窗口2");
        t1.start();
        t2.start();
//        Thread.currentThread().setName("窗口3");
//        while (true){
//            if (ticket.num<1){
//                System.out.println("窗口3票已售空");
//                break;
//            }
//            ticket.sellTicket();
//            System.out.println(Thread.currentThread().getName()+"售出一张票,剩余票数"+ticket.num);
//        }

    }


}
class MyThread01 implements Runnable{
    //多个线程共享 票数
    private Ticket ticket;

    public MyThread01(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (true){
            if (ticket.num<1){
                System.out.println("窗口1的票已售空");
                break;
            }else {
                ticket.sellTicket();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class MyThread02 extends Thread{
    //多个线程共享 票数
    private Ticket ticket;

    public MyThread02(Ticket ticket) {
        this.ticket = ticket;
    }
    @Override
    public void run() {
        while (true){
            if (ticket.num<1){
                System.out.println("窗口2的票已售空");
                break;
            }else {
                ticket.sellTicket();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}
class Ticket{
    public int num;

    public Ticket(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void sellTicket(){

            synchronized (this){
                setNum(num-1);
                System.out.println(Thread.currentThread().getName()+"售出一张票,剩余票数"+num);
            }



    }
}

