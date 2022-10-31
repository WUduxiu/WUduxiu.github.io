package com.study.smallchange零钱通.OOP;

import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key;
        boolean loop = true;
        TestOOP testOOP = new TestOOP();
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
                    testOOP.getDetail();
                    break;
                case "2" :
                    testOOP.getMoney();
                    break;
                case "3" :
                    testOOP.pay();
                    break;
                case "4" :
                    testOOP.exit();
                default:
                    System.out.println("输入的选择有误");
            }
        }while (loop);
    }
}
