package com.study.HomeWork;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(500);
        bankAccount.deposit(50);
        bankAccount.withdraw(100);
        System.out.println(bankAccount.getBalance());
        SavingAccount savingAccount = new SavingAccount(500);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.withdraw(100);
        savingAccount.earnMonthlyInterest();
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.withdraw(200);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
    }
}
class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public void deposit(double amount){//存钱
        balance += amount;
    }
    public void withdraw(double amount){//取款
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class CheckingAccount extends BankAccount{
    private double check;

    public CheckingAccount(double initialBalance, double check) {
        super(initialBalance);
        this.check = check;
    }

    @Override
    public void deposit(double amount) {//存款
        //灵活使用父类的deposit方法
        super.deposit(amount-check);
    }

    @Override
    public void withdraw(double amount) {//取款
        //取款相当于多取出来了 check的金额
        super.withdraw(amount+check);
    }
}
class SavingAccount extends BankAccount{
    private double rate = 0.01;//表示利息
    private int count = 3;
    private double check = 1;

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getCheck() {
        return check;
    }

    public void setCheck(double check) {
        this.check = check;
    }

    @Override
    public void deposit(double amount) {
        if (0<count&&count<=3){
            super.deposit(amount);
        }else {
            super.deposit(amount-check);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if (0<count&&count<=3){
            super.withdraw(amount);
        }else {
           super.withdraw(amount+check);
        }
        count--;
    }
    public void earnMonthlyInterest(){
         count = 3;
        super.deposit(getBalance()*rate);
    }
}


