package com.study.常用类.arrays类;

import java.util.Arrays;

/**
 * @date 2022/10/12&17:06
 */
public class 数组填充fill {
    public static void main(String[] args) {
        Integer [] arr = {1,2,3};
        //使用99这个元素，去替换 arr数组里面的所有元素
        Arrays.fill(arr,99);
        System.out.println(Arrays.toString(arr));
    }
}
