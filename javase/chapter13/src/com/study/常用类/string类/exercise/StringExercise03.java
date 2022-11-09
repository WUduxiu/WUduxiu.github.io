package com.study.常用类.string类.exercise;

/**
 * @date 2022/10/10&16:39
 */
public class StringExercise03 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "java";
        String s4 = "java";
        String s3 = new String("java");
        System.out.println(s3.intern());//java
        System.out.println(s2 == s3);//f
        System.out.println(s2 == s4);//t
        System.out.println(s2.equals(s3));//t
        System.out.println(s1 == s2);//f

    }
}
