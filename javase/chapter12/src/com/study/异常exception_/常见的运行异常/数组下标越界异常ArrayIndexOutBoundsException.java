package com.study.异常exception_.常见的运行异常;

/**
 * @date 2022/10/7&17:20
 */
public class 数组下标越界异常ArrayIndexOutBoundsException {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        for (int i = 0; i < arr.length; i++) {//i<3 输出下标为0-2的元素
            System.out.print(arr[i]);
        }
        System.out.println();
        try {
            for (int i = 0; i<=arr.length; i++) {//i<=3  输出下标为0-3的元素，
                // 可是数组中没有下标为3的元素  这种称为数组下标越界异常
                System.out.print(arr[i]);
            }
            System.out.println("程序正常");//程序没有问题会输出
        } catch (Exception e) {
            System.out.println();
            //e.printStackTrace();
            System.out.println("异常类型为数组下标越界异常"+e.getMessage());
        }
        System.out.println("程序继续运行");
    }
}
