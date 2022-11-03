package com.study.常用类.string类.stringmethod;

/**
 * @date 2022/10/10&21:54
 */
public class 字符串的拼接和替换StringMethod_concat {
    public static void main(String[] args) {
        //concat 字符串拼接操作
        String s1 = "宝玉";
        s1 = s1.concat("林黛玉").concat("123");
        System.out.println(s1);
        //replace 替换字符串中的字符
        String s2 = "hellol";
        s2.replace("ll","a");//用后面的新字符替换前面旧的字符
        System.out.println(s2);
        System.out.println(s2.replace("ll","a"));//只有接收过后才对s2有影响
    }
}
