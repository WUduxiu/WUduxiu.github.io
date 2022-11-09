package com.study.常用类.homework.teacher;

import java.util.Locale;

/**
 * @date 2022/10/13&9:44
 */
public class TeacherTest03 {
    public static void main(String[] args) {
        String name = null;
       // System.out.println(name.length());
      //  System.out.println(name.charAt(0));//数组中第几个元素
        try {
            print(name);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
    public static void print(String name){
        if (name==null){
            throw new RuntimeException("名字不能为空");
        }
        String[] names = name.split(" ");//按照空格 将字符串分成三份
        if (names.length!=3) {
            throw new RuntimeException("输入的名字格式不对");
        }
        char[] chars = name.toCharArray();
        String format = String.format("%s,%s .%c", names[2], names[0], names[1].toUpperCase(Locale.ROOT).charAt(0));
        System.out.println(format);
        System.out.println(format.length());

    }
}
