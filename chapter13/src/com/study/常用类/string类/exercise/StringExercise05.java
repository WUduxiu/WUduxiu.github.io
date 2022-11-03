package com.study.常用类.string类.exercise;

/**
 * @date 2022/10/10&17:13
 */
public class StringExercise05 {
    public static void main(String[] args) {
        /*
        String 是一个final类，代表不可变的字符序列
        字符串是不可改变的。一个字符串一旦被分配，其内容是不可改变的
         */
        String s = "hello";
        s = "java";//这里并不会直接覆盖，而是先去常量池中寻找是否有"java"这个字符串，如果没有就创建，有的话就就指向
        //创建了俩个字符串常量对象
    }
}
