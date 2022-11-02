package com.study.异常exception_.常见的运行异常;

/**
 * @date 2022/10/7&17:39
 */
public class 数字格式不正确异常NumberFormatException {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "hello";
        int n1 = Integer.valueOf(num1);
        System.out.println(n1);
        int n2 = 0;
        try {
            n2 = Integer.valueOf(num2);
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            System.out.println("抛出的异常为数字格式不正确异常"+e.getMessage());
        }
        System.out.println(n2);
        System.out.println("程序继续运行");
    }
}
