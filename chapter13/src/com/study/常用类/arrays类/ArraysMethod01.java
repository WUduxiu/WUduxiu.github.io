package com.study.常用类.arrays类;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @date 2022/10/11&23:37
 */
public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer [] integers = {1,2,3,-5,66};
        //1.遍历数组 ：直接使用Arrays.toString方法打印数组
        System.out.println(Arrays.toString(integers));
        //2.排序  sort方法
        Arrays.sort(integers);
        //因为数组是引用类型，所以通过sort排序后，会直接影响到 实参 integers
        System.out.println("从小到大排序后的数组");
        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers, new Comparator<Integer>() {
            /*
            传入俩个参数，一个是数组 还一个是实现了接口的匿名内部类
             */
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
                /*
                o1-o2 :从小到大排序
                o2-o1 ：从大到小排序
                 */
            }
        });
        System.out.println("自定义排序：从大到小");
        System.out.println(Arrays.toString(integers));
    }
}
