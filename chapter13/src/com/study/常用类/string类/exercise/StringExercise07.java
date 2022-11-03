package com.study.常用类.string类.exercise;

/**
 * @date 2022/10/10&20:21
 */
public class StringExercise07 {
    public static void main(String[] args) {
         String a = "hello";
         String a1  = new String("hello");
         String b = "abc";
         String b1 = new String("abc");
         String c = a +b;//创建了三个对象  俩个在常量池 一个在堆
         /*
         String c = a + b ;底层代码实现
           1.先创建一个 StringBuilder  sb = new StringBuilder();
           2.执行 sb.append("hello");
           3.执行 sb.append("abc");
           4.执行  public String toString(){
                 return new String(value,0,count);
                 value就是sb.append("hello");sb.append("abc");
                 count 16个字节里面  hello+abc占八个位置 （0-15） count = 7
           5. String c = sb.toString();
          最后其实就是 c 指向堆中的对象(String) value[]----> 常量池中的"helloabc"
           }
           总结：
           常量相加，看的是池 有底层优化 只创建了一个字符串常量
           变量相加，看的是堆 创建了三个对象 结果在堆 两个在常量池
          */
        String d = "helloabc";
        String d1 =  a1 + b;
        System.out.println(c==d1);
        System.out.println(d1);
        System.out.println(c==d);//f
        String e = new String("helloabc");

    }
}
