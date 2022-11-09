package com.study.smallchange零钱通;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class SmallChangeSys{
    public static void main(String[] args) {
        //1.先完成菜单显示，并且有选择功能以及提示信息
        //2.完成零钱通明细: 1.用数组记录数据  2.用对象记录  3.字符串拼接
        //3.完成收益入账
        //4.消费
        //5.退出
        //6.用户输入4退出时，给出提示“是否要退出，必须输入正确的y/n”否则循环输出，直到输入y/n为止
        //7.在收账和消费时判断金钱是否合理，并给出相应的提示

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
                    if (detail.equals("----------------零钱通明细-----------------")){
                        System.out.println("近期还没有明细记录");
                    }else {
                        System.out.println(detail);
                    }
                    break;
                case "2" :
                    System.out.print("请输入入账金额");
                    money = scanner.nextDouble();
                    //找出不正确的条件
                    if (money < 0){
                        System.out.println("输入的金额有误，请重新输入");
                        break;
                    }
                    balance = balance+money;
                    detail+= "\n收益入账\t+"+money+"\t"+simpleDateFormat.format(date) +"\t"+ balance;
                    break;
                case "3" :
                    System.out.print("请输入消费方式");
                    way = scanner.next();
                    System.out.print("请输入消费金额");
                    pay = scanner.nextDouble();
                    if (pay <= 0 || pay>balance){
                        System.out.println("输入的金额有误，请重新输入");
                        break;
                    }
                    balance = balance-pay;
                    detail+="\n"+  way+"\t\t-"+pay+"\t"+simpleDateFormat.format(date)+"\t"+balance;
                    break;
                case "4" :
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
                    break;
                default:
                    System.out.println("输入的选择有误");
            }
        }while (loop);
    }
}
