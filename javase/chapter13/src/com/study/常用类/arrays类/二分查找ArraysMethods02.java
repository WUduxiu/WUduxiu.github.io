package com.study.常用类.arrays类;

import java.util.Arrays;

/**
 * @date 2022/10/12&16:43
 */
public class 二分查找ArraysMethods02 {
    public static void main(String[] args) {
        Integer[] arr = {1,5,6,88,-9,5};
        Integer[] arr2 = {1,2,3,4,5};
        Arrays.sort(arr);
        System.out.println("默认的排序，从小到大"+Arrays.toString(arr));
        //Arrays.binarySearch()方法 ，通过二分法搜索进行查找，但是要求查找的数组必须是已经排好序数组
        /*
        使用Arrays.binarySearch() 二叉查找
        1.要求查找的数组是有序的 查找到了就返回该数组（第一个该元素）的下标  未排序的数组，不能使用二叉查找
        2.如果查找的值不存在该数组，就return -(low + 1);  low是指原本应该存在的位置
         */
        System.out.println("Index="+Arrays.binarySearch(arr,-6));
        //如果存在-6的话，其下标为1 即low=1 但是不存在 所以就返回 -(1+1)=-2 返回值为-2
    }
}
