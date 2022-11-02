package com.study.异常exception_.常见的运行异常;

/**
 * @date 2022/10/7&17:07
 */
public class 数学运算异常ArithmeticException {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        try {
            int res = n1/n2;
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("类型异常为数学运算异常"+e.getMessage());
        }
        System.out.println("程序继续运行");
    }
}
