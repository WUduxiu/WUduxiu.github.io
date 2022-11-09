package com.study.常用类.arrays类;

import java.util.Arrays;

/**
 * @date 2022/10/12&17:10
 */
public class 数组内容的比较equals {
    public static void main(String[] args) {
        Integer [] arr1 = {1,5,3,5,5};
        Integer [] arr2 = {2,5,6,7};
        //判断俩个数组的内容是否一致
        System.out.println(Arrays.equals(arr1,arr2));
    }
}
