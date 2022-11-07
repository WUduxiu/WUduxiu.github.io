package com.study.线程thread.线程的安全threadsafe.syncgronized在实例方法上;

/**
 * @date 2022/10/21&16:56
 */
public class Account {
    private String name;//账户
    private double balance;//余额

    public Account() {
    }

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

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
    //synchronized 出现在实例方法上 锁的一定是this(该类) 不灵活
    //另外，synchronized 出现在实例方法上，表示整个方法需要同步，可能会无故扩大同步范围，导致程序效率降低
    //唯一的优点：减少代码
    //如果确定需要共享的变量就是this 且整个方法都需要同步 推荐使用synchronized直接加在方法体上
    public synchronized void withdraw(double money){
        double before = this.getBalance();//取款之前
        double after = before-money;//取款之后
        //模拟网络波动 余额不能及时更新
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setBalance(after);//更新余额
    }
}
