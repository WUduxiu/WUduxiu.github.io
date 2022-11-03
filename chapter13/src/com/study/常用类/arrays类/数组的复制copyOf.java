package com.study.常用类.arrays类;

import java.util.Arrays;

/**
 * @date 2022/10/12&16:59
 */
public class 数组的复制copyOf {
    public static void main(String[] args) {
        Integer [] oldArr = {1,2,3,4};
        /*
        Arrays.copyOf(oldArr,oldArr.length);
        从oldArr数组中 拷贝oldArr.length到 newArr数组中
        如果拷贝的长度大于旧数组的长度，就在新数组后面+null
        如果拷贝的长度<0 就抛出异常 NegativeArraySizeException
        底层源码使用的方法：  System.arraycopy
         */
        Integer [] newArr = Arrays.copyOf(oldArr,oldArr.length-1);
        System.out.println("旧数组"+Arrays.toString(oldArr));
        System.out.println("新数组"+Arrays.toString(newArr));
    }
}
