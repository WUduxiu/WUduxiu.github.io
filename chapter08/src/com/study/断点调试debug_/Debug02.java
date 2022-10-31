package com.study.断点调试debug_;

public class Debug02 {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("退出了for循环 ");
    }
}
