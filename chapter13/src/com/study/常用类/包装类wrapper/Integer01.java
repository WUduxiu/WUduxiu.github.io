package com.study.常用类.包装类wrapper;

/**
 * @date 2022/10/9&23:26
 */
public class Integer01 {
    public static void main(String[] args) {
        //演示 int<---->Integer 的装箱和拆箱
        //jdk5以前的手动装箱和拆箱
        int n1 = 100;
        //手动装箱 int----->Integer
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        //手动拆箱  Integer------> int
        int i = integer.intValue();
        //-----------------------------------------
        //jdk5包括jdk5以后的手动装箱和拆箱
        int n2 = 200;
        //自动装箱 int----->Integer
        Integer integer2 = n2;//底层使用的还是手动装箱  Integer.valueOf(n2)
        //自动拆箱  Integer------> int
        int n3 = integer2;//底层使用的也是手动拆箱  intValue()方法
    }
}
