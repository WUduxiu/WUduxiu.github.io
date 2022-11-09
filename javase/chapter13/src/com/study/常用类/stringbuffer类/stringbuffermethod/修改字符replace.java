package com.study.常用类.stringbuffer类.stringbuffermethod;

/**
 * @date 2022/10/11&21:05
 */
public class 修改字符replace {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("0123456");
        /*
        replace 也是前闭后开[0,5)  使用abcde 替换01234
         */
        stringBuffer.replace(0,5,"abcde");
        System.out.println(stringBuffer);
    }
}
