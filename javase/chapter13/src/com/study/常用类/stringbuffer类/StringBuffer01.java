package com.study.常用类.stringbuffer类;

/**
 * @date 2022/10/10&22:37
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        /*
          1.StringBuffer的直接父类是 AbstractStringBuilder
          2.实现了 Serializable接口 ，即StringBuffer的对象可以串行化
          3.在父类 AbstractStringBuilder中 有属性 char[] value，不是final
          //该value数组 存放的字符串内容，因此存放在堆中
          StringBuffer是一个final类 不能被继承
         */
        StringBuffer stringBuffer = new StringBuffer();
        //System.out.println(a.equals(b));
        /*String:
        StringBuffer和String的对比
        String保存的是字符串常量，里面的值不能更改(不能改变地址)，每次String类的更新实际上就是更改地址
        效率较低 原因：private final char value[]
        StringBuffer:
        StringBuffer保存的是字符串常量，里面的值可以更改，每次StringBuffer的更新实际上可以更新内容，不用每次更新地址
        效率高 原因： private char value[] 放在堆中
         */
    }
}
