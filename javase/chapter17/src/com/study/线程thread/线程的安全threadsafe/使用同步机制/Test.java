package com.study.线程thread.线程的安全threadsafe.使用同步机制;

/**
 * @date 2022/10/21&17:12
 */
public class Test {
    public static void main(String[] args) {
        Account account = new Account("账户001", 10000);
        AccountThread t1 = new AccountThread(account);
        t1.setName("t1");
        t1.start();
        AccountThread t2 = new AccountThread(account);
        t2.setName("t2");
        t2.start();

    }
}
