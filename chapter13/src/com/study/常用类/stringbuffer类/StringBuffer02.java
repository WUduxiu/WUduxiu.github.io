package com.study.常用类.stringbuffer类;

/**
 * @date 2022/10/10&23:38
 */
public class StringBuffer02 {
    public static void main(String[] args) {
       //StringBuffer构造器的使用
        //1.创建一个默认大小为 16 的char[]，用于存放字符内容
        StringBuffer stringBuffer = new StringBuffer();
        //2.通过构造器指定 char[]大小 为100
        StringBuffer stringBuffer1 = new StringBuffer(100);
        //3.通过构造器 给一个String 创建 StringBuffer 此时char数组大小就是 16+字符串长度(5) = 21
        StringBuffer stringBuffer2 = new StringBuffer("hello");
        System.out.println(stringBuffer2.toString());


    }
}
