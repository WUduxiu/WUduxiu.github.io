package com.study.线程thread.线程的安全threadsafe.syncgronized在实例方法上;

/**
 * @date 2022/10/21&17:02
 */
public class AccountThread extends Thread{
    private Account account;//共享一个账户

    public AccountThread(Account account) {
        this.account = account;
    }

    @Override
    //run()方法的执行表示取款操作
    public void run() {
        double money = 5000;//模拟取款5000
        account.withdraw(money);
        System.out.println(Thread.currentThread().getName()+"线程 取款"+money+"成功 余额="+account.getBalance());
    }
}
