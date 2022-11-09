package com.study.常用类.homework;

/**
 * @date 2022/10/13&10:52
 */
public class Test05 {
    public static void main(String[] args) {
        String s1 = "hspedu";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a==b);//f
        System.out.println(a.equals(b));//f   a.equals(b) a此时是对象 用的还是Object里面的equals没有重写过的
                                            //实际上比较的还是地址
        System.out.println(a.name==b.name);//t
        String s4 = new String("hspedu");
        String hello = new String("hspedu");
        String s6 = s4 +hello;
        String s5 = "hspeud";
        System.out.println(s1==s4);//f
        System.out.println(s4==s5);//f
        String t1 = "hspeud" +s4;
        String t2 = "hellohspedu";
        String t3 = new String("hellohspedu");
        System.out.println(t1==t3);//t   t1.intern()是直接指向常量池的地址
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t3.hashCode());


    }
}
class Animal{
    String name;

    public Animal(String name) {
        //new String(name);
        this.name = name;
    }
}
