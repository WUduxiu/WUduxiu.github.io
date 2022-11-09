package com.study.常用类.stringbuffer类;

/**
 * @date 2022/10/10&23:53
 */
public class StringBuffer和String的转换 {
    public static void main(String[] args) {
        //String----->StringBuffer
        String str = "hello";
        //方式1 使用构造器
        //返回值才是StringBuffer对象，对 str没有影响 仍然是一个String类
        StringBuffer stringBuffer = new StringBuffer(str);
        //方式2 使用append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);
        System.out.println(stringBuffer);
        System.out.println(stringBuffer1);


        //StringBuffer---->String
        //1.使用StringBuffer提供的toString()方法进行转换
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer();
        String s1 = stringBuffer2.toString();
        //2.使用String的构造器
        String s2 = new String(stringBuffer3);
    }
}
