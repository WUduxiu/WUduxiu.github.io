package com.study.线程thread.homework.银行取款;

/**
 * @date 2022/10/24&9:49
 */
public class Test01 {
    public static void main(String[] args) {
        Account account = new Account("001", 10000);
        Thread thread = new Thread(new A(account));
        Thread thread1 = new Thread(new B(account));
        thread1.start();
        thread.start();
    }
}
class A implements Runnable {
    public A(Account account) {
        this.account = account;
    }

    private Account account;

    @Override
    public void run() {
        while (true) {
            if (account.getBalance() <1000) {
                System.out.println("余额小于1000元，无法取出");
                break;
            }else {
                account.drawWith(1000);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
class B implements Runnable{
    private Account account;

    public B(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        while (true){
            if (account.getBalance()<1000){
                System.out.println("余额小于1000元，无法取出");
                break;
            }else {
                account.drawWith(1000);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}
class Account{
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void drawWith(double money){
        synchronized (this){
                setBalance(balance-money);
                System.out.println(Thread.currentThread().getName()+" 取款1000元成功,余额剩余: "+getBalance());
        }
    }
}
