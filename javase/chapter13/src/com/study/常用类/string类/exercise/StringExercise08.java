package com.study.常用类.string类.exercise;

/**
 * @date 2022/10/10&20:51
 */
public class StringExercise08 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "java";
        String s5 = "hellojava";
        String s6 = (s1+s2).intern();
        System.out.println(s5==s6);//t
        System.out.println(s5.equals(s6));//t
    }
}
