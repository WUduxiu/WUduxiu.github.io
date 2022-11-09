package com.study.异常exception_.常见的运行异常;

/**
 * @date 2022/10/7&16:50
 */
public class 空指针异常NullPointerException {
    public static void main(String[] args) {
        String name = "123";
        String exception = null;
        String test = "";
        System.out.println(name.length());//返回字符串的长度 3
        System.out.println(test.length());//0
        try {
            System.out.println(exception.length());//因为是空指针，所以会抛出异常
        } catch (Exception e) {
           //e.printStackTrace();
            System.out.println("异常类型为空指针异常"+e.getMessage());
        }


        System.out.println("程序继续运行");

    }
}
