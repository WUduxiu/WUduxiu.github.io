package com.study.常用类.stringbuffer类.exercise;

import java.util.Scanner;

/**
 * @date 2022/10/11&21:25
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品名称");
        String name = scanner.next();
        System.out.println("请输入商品价格");
        String price = scanner.next();
        StringBuffer stringBuffer = new StringBuffer(price);
        for (int i=stringBuffer.lastIndexOf(".")-3; i >0 ; i-=3) {
            stringBuffer.insert(i,",");
        }
        System.out.println("商品名称 "+"\t"+"商品价格");
        System.out.println(name +"\t\t\t"+stringBuffer);


    }
}
