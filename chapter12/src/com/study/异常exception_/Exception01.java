package com.study.异常exception_;

/**
 * @date 2022/10/7&16:11
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //程序抛出异常：ArithmeticException (算术异常) ---->运行时异常
        //当抛出异常后，程序就退出了，崩溃了，就不再执行下面的语句了  Create breakpoint
        /*
        如果程序员认为一段代码可能出现问题，可以使用 try-catch异常处理机制来解决
        快捷键：Ctrl+Alt+t 选择 tyr-catch
        如果使用了异常处理机制，即使程序报错，程序也还可以继续执行
         */
        try {//先尝试运行，如果没问题就通过，有问题就捕获异常，并输出异常信息
            int res = num1/num2;//此时相当于 10/0 分母为0
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("异常信息为"+e.getMessage());
        }
        System.out.println("程序继续运行");
    }
}
