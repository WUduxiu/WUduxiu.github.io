package com.study.类详解object_;

public class EqualsExercise02 {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        p1.name = "hspedu";
        Person2 p2 = new Person2();
        p2.name = "hspedu";
        //此时p1 == p2  俩个比较的对象是引用类型 就是判断他们俩的引用地址是否相同
        System.out.println(p1==p2);//f
        //此时的String 里面重写了equals方法 用来判断其内容是否相等
        System.out.println(p1.name.equals(p2.name));//t
        //未重写的equals方法也就是判断是否是一个对象
        System.out.println(p1.equals(p2));//f
        String s1 = new String("abc");
        String s2 = new String("abc");
        //String 也是引用类型  == 用来判断是否是同一个对象
        System.out.println(s1.equals(s2));//t
        System.out.println(s1 == s2);//f
    }


}
class Person2{
    public String name;
}
