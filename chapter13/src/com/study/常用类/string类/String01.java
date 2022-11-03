package com.study.常用类.string类;

/**
 * @date 2022/10/10&10:49
 */
public class String01 {
    public static void main(String[] args) {
        String name = "jack";
        /*
        1.String 对象用于保存字符串，也就是一组字符序列
        2."jack" 是字符串常量,使用双引号""括起来的字符序列
        3.字符串的字符使用Unicode字符编码，一个字符(不区分字母还是汉字)占两个字节
        4.String类有很多构造器，构造器的重载
            常用的有 String s1 = new String();
                    String s2 = new String(String original);
                    String s3 = new String(char[] a);
                    String s4 = new String(char[] a,int startIndex,int count);
                    String s5 = new String(byte[] b);
        5.String类实现了接口 Serializeable(实现了该接口，String可以串行化:即可以在网络传输)
          String类还实现了接口 Compareable(String对象可以比较大小)
        6.String类 是final类 ：无法被继承
        7.String有属性 :private final byte[] value;用于存放字符串内容
        8.注意：value 是一个 final类型的 不可以被修改(不能被指向新的地址) 但是单个字符的内容可以变化
         */
        final byte [] value = {'a','b','c'};
        value[0] = 'A';//单个字符内容可以变化
        byte [] value2 = {'t','o','m'};
        //value = value2;// 不能修改value的地址
    }
}
