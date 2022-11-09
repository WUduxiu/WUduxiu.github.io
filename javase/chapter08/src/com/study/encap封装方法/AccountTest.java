package com.study.encap封装方法;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account("jack",190);
        a.info();



    }
}
class Account{
    private String name;
   private double salary;

    public Account(String name, double salary) {
        setName(name);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2&&name.length()<=4){
            this.name = name;
        }else {
            System.out.println("输入的名字有误（长度在2-4），请重新输入");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入密码");
        int password = scanner.nextInt();
        if (password ==123456){
            if (salary>20){
                this.salary = salary;
            }else {
                System.out.println("余额小于20元，无法查看，返回默认值0.0");
            }


        }else{
            System.out.println("密码有误无法查看（密码长度为六位数），返回默认值0.0");
        }

    }
    public void info(){
        System.out.println("name="+this.name+" salary="+this.salary);
    }
}
