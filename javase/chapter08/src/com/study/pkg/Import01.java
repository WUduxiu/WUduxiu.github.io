package com.study.pkg;

import java.util.Arrays;

public class Import01 {
    public static void main(String[] args) {
        int [] arr = {1,10,51,35,56,55,87};
        System.out.println("未排序之前");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("排序之后");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
