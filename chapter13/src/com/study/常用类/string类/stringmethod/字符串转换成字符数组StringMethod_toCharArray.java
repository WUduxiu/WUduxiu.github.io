package com.study.常用类.string类.stringmethod;

/**
 * @date 2022/10/10&22:13
 */
public class 字符串转换成字符数组StringMethod_toCharArray {
    public static void main(String[] args) {
        String s = "happy";
        char [] chs = s.toCharArray();//toCharArray()字符串转换成数组
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
    }
}
