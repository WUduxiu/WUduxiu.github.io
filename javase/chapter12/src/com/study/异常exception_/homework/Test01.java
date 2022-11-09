package com.study.异常exception_.homework;

import java.util.Scanner;

/**
 * @date 2022/10/9&22:14
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            if (args.length!=2){
                throw new ArrayIndexOutOfBoundsException("传入参数个数不对，需要传入俩个参数");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int res = cal(n1,n2);
            System.out.println("计算的结果为"+res);
        } catch (ArrayIndexOutOfBoundsException e) {//传入的参数个数不对---->数组越界
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {//数字类型转换异常
            System.out.println("格式输出不对，需要输出整数");
        } catch (ArithmeticException e){//数学算术异常
            System.out.println("除数为0");
        }
    }
    public static int cal(int n1,int n2){
        return n1/n2;
    }
}

