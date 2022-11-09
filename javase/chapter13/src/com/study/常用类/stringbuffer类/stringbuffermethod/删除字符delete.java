package com.study.常用类.stringbuffer类.stringbuffermethod;

/**
 * @date 2022/10/11&21:01
 */
public class 删除字符delete {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("0123456");
        /*
        删除索引（下标从0开始） 下标为0-5 [0,5) 前闭后开
         */
        stringBuffer.delete(0,5);//
        System.out.println(stringBuffer);
    }
}
