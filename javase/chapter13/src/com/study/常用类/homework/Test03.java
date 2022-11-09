package com.study.常用类.homework;

import java.util.Locale;

/**
 * @date 2022/10/13&9:09
 */
public class Test03 {
    public static void main(String[] args) {
     print("Willian Jefferson Clinton");

    }
    public static void print(String name){
        int i = name.indexOf(" ");
        int j = name.lastIndexOf(" ");
        char[] chars = name.toCharArray();
        String a = name.substring(0,i);
        String b = name.substring(i+1,i+2);
        String B = b.toUpperCase(Locale.ROOT);
        String c = name.substring(j+1,name.length());
        chars[i] = ',';
        chars[j] = '.';
        String s = String.valueOf(chars[i]);
        String s1 = String.valueOf(chars[j]);
        String newName = c+s+a+s1+B;
        System.out.println(newName);
    }
}
