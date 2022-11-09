package com.study.常用类.stringbuffer类.stringbuffermethod;

/**
 * @date 2022/10/11&20:56
 */
public class 增加字符append {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
         s.append("java");
        System.out.println(s);//默认的toString方法

    }
}
