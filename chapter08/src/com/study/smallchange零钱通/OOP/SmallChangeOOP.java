package com.study.smallchange零钱通.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    double money;
    double balance = 0;
    String way = null;
    double pay = 0;
    String detail = "----------------零钱通明细-----------------";
    public void mainMenu(){
        do {
            System.out.println("----------------零钱通菜单-----------------");
            System.out.println("\t\t\t\t1 零钱通明细");
            System.out.println("\t\t\t\t2 收益入账");
            System.out.println("\t\t\t\t3 消费");
            System.out.println("\t\t\t\t4 退     出");
            System.out.print("请选择(1-4):");
            key = scanner.next();
            switch (key){
                case "1" :
                    getDetail();
                    break;
                case "2" :
                   getMoney();
                    break;
                case "3" :
                   pay();
                    break;
                case "4" :
                exit();
                default:
                    System.out.println("输入的选择有误");
            }
        }while (loop);
    }
    public void getDetail(){
        if (detail.equals("----------------零钱通明细-----------------")){
            System.out.println("近期还没有明细记录");
        }else {
            System.out.println(detail);
        }
    }
    public void getMoney(){
        System.out.print("请输入入账金额");
        money = scanner.nextDouble();
        //找出不正确的条件
        if (money < 0){
            System.out.println("输入的金额有误，请重新输入");
            return;
        }
        balance = balance+money;
        detail+= "\n收益入账\t+"+money+"\t"+simpleDateFormat.format(date) +"\t"+ balance;
    }
    public void pay() {
        System.out.print("请输入消费方式");
        way = scanner.next();
        System.out.print("请输入消费金额");
        pay = scanner.nextDouble();
        if (pay <= 0 || pay > balance) {
            System.out.println("输入的金额有误，请重新输入");
            return;
        }
        balance = balance-pay;
        detail+="\n"+  way+"\t\t-"+pay+"\t"+simpleDateFormat.format(date)+"\t"+balance;
        }
    public void exit(){
            String choice = "";
            while (true){
                System.out.println("是否退出零钱通程序 y/n");
                choice = scanner.next();
                if ("y".equals(choice)||"n".equals(choice)){
                    break;
                }
            }
            if (choice.equals("y")){
                System.out.println("---------------退出了零钱通程序---------------");
                loop = false;
            }
    }
}
