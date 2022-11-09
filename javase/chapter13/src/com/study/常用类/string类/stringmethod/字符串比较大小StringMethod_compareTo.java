package com.study.常用类.string类.stringmethod;

/**
 * @date 2022/10/10&22:15
 */
public class 字符串比较大小StringMethod_compareTo {
    public static void main(String[] args) {
        String a = "jbkk";
        String b = "jack";
        /*
        a-b
        如果俩个字符串长度相等就是 对应的字符的阿斯克编码进行比较 因为char可以直接运算
        如果长度不同就是长度相减
        如果字符串内容相等  则返回0
         */
        System.out.println(a.compareTo(b));
    }
}
