package com.study.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @date 2022/10/14&21:18
 */
@SuppressWarnings("all")
public class HashSet01 {
    public static void main(String[] args) {
        Set set = new HashSet();
        /*
        构造器源码： 底层实际上还是一个HashMap
        public HashSet() {
        map = new HashMap<>();
        }
         */
        /*
        1.在执行add() remove()后会返回一个 boolean值
        2.如果添加成功，返回true，否则返回 false
        3.可以通过remove 指定删除那个元素
         */
        System.out.println(set.add("jojo"));//t
        System.out.println(set.add("lucy"));//t
        System.out.println(set.add("jojo"));//f
        System.out.println(set.add("jack"));//t
        System.out.println(set.add("rose"));//t
        System.out.println(set.remove("jojo"));//t
        /*

         */
        System.out.println(set.add(new Dog()));//T
        System.out.println(set.add(new Dog()));//T
        System.out.println(set.add(new String("123")));//T
        System.out.println(set.add(new String("123")));//不能添加   源码
        System.out.println("set="+set);//返回的结果不是按添加的顺序来返回的
    }
}
class Dog{
    @Override
    public String toString() {
        return "Dog{}";
    }
}
