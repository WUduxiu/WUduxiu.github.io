package com.study.常用类.string类.exercise;

/**
 * @date 2022/10/10&20:06
 */
public class StringExercise06 {
    public static void main(String[] args) {
        String a = "hello" + "abc";//底层代码进行优化：String a = "helloabc";
                                    //只在常量池创建了一个字符串常量对象


    }
}
