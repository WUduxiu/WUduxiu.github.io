package com.study.常用类.string类.exercise;

/**
 * @date 2022/10/10&16:45
 */
public class StringExercise04 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "hspedu";
        Person p2 = new Person();
        p2.name = "hspedu";
        System.out.println(p1.name.equals(p2.name));//t
        System.out.println(p1.name == p2.name);//t
        System.out.println(p1.name == "hspedu");//t  "hspedu"本身就是在常量池中，返回的地址也就是在常量池中

        String s1 = new String("bcde");
        String s2 = new String("bcde");
        System.out.println(s1 == s2);//f
    }
}
class Person{
    public String name;
}
