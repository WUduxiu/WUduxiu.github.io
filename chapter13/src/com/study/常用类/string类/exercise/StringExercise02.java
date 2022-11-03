package com.study.常用类.string类.exercise;

/**
 * @date 2022/10/10&16:07
 */
public class StringExercise02 {
    public static void main(String[] args) {
        String a = "hsp1";//      a 指向常量池中的"hsp"
        String b = new String("hsp");//  b指向堆中的一个对象(value)  该对象再指向常量池
        System.out.println(a.equals(b));//f
        System.out.println(a==b);//f
        /*
        b.intern()：
        当调用intern()方法时，如果池中已经包含一个等于此String对象的字符串(用equals(Object)方法确定)，则返回池中字符串
        否则，将此String对象添加到池中，并返回此String对象的引用
         b.intern()方法最终返回的是常量池的地址(对象) 即（"hsp"）
         */
        System.out.println(b.intern());//hsp
        System.out.println(a==b.intern());//f
        System.out.println(b==b.intern());//f
    }
}
