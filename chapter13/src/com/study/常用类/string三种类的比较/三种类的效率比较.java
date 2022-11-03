package com.study.常用类.string三种类的比较;

/**
 * @date 2022/10/11&22:24
 */
public class 三种类的效率比较 {
    /*
    1.存在大量修改操作，一般使用StringBuffer或者StringBuilder
    2.存在大量修改操作，并且是单线程 使用StringBuilder
    3.存在大量修改操作，并且是多线程 使用StringBuffer
    4.如果字符串很少修改，并且被多个对象引用，使用String(比如配置信息的时候)
     */
    public static void main(String[] args) {
        String text = "";
        long startTime = 0L;
        long endTime = 0L;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            stringBuilder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder()所用时间为"+(endTime-startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            stringBuffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer()所用时间为"+(endTime-startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = String.valueOf(i)+text;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String()所用时间为"+(endTime-startTime));

    }
}
