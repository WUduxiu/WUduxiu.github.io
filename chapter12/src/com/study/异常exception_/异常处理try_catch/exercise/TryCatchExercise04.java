package com.study.异常exception_.异常处理try_catch.exercise;

import java.util.Scanner;

/**
 * @date 2022/10/9&16:28
 */
public class TryCatchExercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Scanner scanner1 = new Scanner(System.in);
//        int num = 0;
//        String inputStr = "";
//        while (true){
//            System.out.println("请输入一个整数");
//            inputStr = scanner.next();
//            try {
//                num = Integer.parseInt(inputStr);
//                System.out.println("接收到整数"+num);
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("你输入的不是一个整数");
//            }
//
//        }


        try {
            System.out.println("请输入一个值");
            //System.out.println(scanner.next());
            String str = scanner.next();
            int a = Integer.valueOf(str);
            System.out.println("接收到整数" + a);
        } catch (NumberFormatException e) {
            while (true) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("请输入正确的整数");
                if (scanner1.hasNextInt()) {
                    System.out.println("接收到了整数" +scanner1.next());
                    break;
                }
            }
        }

    }
}
