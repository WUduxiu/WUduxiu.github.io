package com.study.线程thread.线程的安全threadsafe.未使用同步机制;

/**
 * @date 2022/10/21&16:56
 */
public class Account {
    private String name;//账户
    private double balance;//余额
    Object object = new Object();//一个实例变量，
                                //(Account对象是多线程共享的，Account中的实例变量obj也是共享的)

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
    //取款
    public void withdraw(double money){
        /*
        1.以下几行代码必须是线程排队的，不能并发
        2.一个线程把代码块里面的代码全部执行，另一个线程才能进来
        3. synchronized (){
            //线程同步代码块
        }
        synchronized () ()中的数据必须是多线程共享的数据，才能达到多线程排队的效果
        ()中的值如果填？
        现在有t1,t2,t3,t4,t5五个线程
        如果想让t1,t2,t3这三个线程排队 而t4和t5不需要排队
         就需要在()填入t1,t2,t3这个三个线程共享的数据 而t4和t5并不共享

         */
            //()里面只要是属于t1和t2的共享对象就行
        Object o = new Object();
        //此时()里面填 o 不行 因为o是局部变量
        //此时t1和t2共享的数据就是这个账户类
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
