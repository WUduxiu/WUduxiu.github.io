package com.study.类详解object_;

public class EqualsExercise03 {
    public static void main(String[] args) {
        int it = 65;
        float f1 = 65.0f;
        System.out.println("65和65.0f是否相等"+(it==f1));//t
        char ch1 = 'A'; char ch2 = 12;
        //char 也是基本数据类型 可以直接比较
        System.out.println("65和 ’A‘是否相等"+(it==ch1));//t
        System.out.println("12和ch2是否相等"+(12==ch2));//t

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1==str2);//f
        System.out.println(str1.equals(str2));//t
        //System.out.println("hello" == new java.sql.Date());  编译错误
    }
}
