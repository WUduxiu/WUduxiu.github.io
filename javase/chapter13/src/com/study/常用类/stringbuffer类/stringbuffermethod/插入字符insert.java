package com.study.常用类.stringbuffer类.stringbuffermethod;

/**
 * @date 2022/10/11&21:09
 */
public class 插入字符insert {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("0123456");
        stringBuffer.insert(0,"A");//在索引为0的位置插入A  原来的索引内容自动后移
        System.out.println(stringBuffer);
    }
}
