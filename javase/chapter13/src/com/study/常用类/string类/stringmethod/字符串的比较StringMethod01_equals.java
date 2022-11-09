package com.study.常用类.string类.stringmethod;

/**
 * @date 2022/10/10&21:18
 */
public class 字符串的比较StringMethod01_equals {
    public static void main(String[] args) {
        //1.
        String s1 = "hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));//f  equals比较内容相等但是区分大小写
        //2.equalsIgnoreCase 也是判断内容是否相等但是区分大小写
        String username = "jack";
        if ("JACK".equalsIgnoreCase(username)){
            System.out.println("内容相等");
        }else {
            System.out.println("内容不相等");
        }

    }
}
