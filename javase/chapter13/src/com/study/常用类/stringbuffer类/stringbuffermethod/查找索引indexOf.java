package com.study.常用类.stringbuffer类.stringbuffermethod;

/**
 * @date 2022/10/11&21:07
 */
public class 查找索引indexOf {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("01234056");
        System.out.println(stringBuffer.indexOf("0"));//查找字字符串第一次出现的索引
        System.out.println(stringBuffer.indexOf("c"));//查找不到返回-1
    }
}
