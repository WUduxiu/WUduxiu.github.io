package com.study.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @date 2022/10/14&21:04
 */
@SuppressWarnings("all")
public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        //1.以set接口的实现类 HashSet 实现Set接口的方法
        //2.set 接口的实现类的对象(Set接口对象) 不能存放重复的元素  可以添加null 但是只能添加一个null
        //3.set接口对象存放数据是无序的(即添加的顺序和取出的顺序是不一致的)
        //4.取出的顺序是固定的，虽然不是添加的顺序  但不是随机的
        set.add("jack");
        set.add("tom");
        set.add("jack");
        set.add("tom");
        set.add("null");
        set.add("null");
        System.out.println(set);
        //遍历方式
        //1.迭代器遍历
        System.out.println("---迭代器遍历----");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        //2.增强for循环遍历
        System.out.println("-------增强for循环遍历-----");
        for (Object o : set) {
            System.out.println(o);
        }
        //3.不能通过for i 来循环 因为set接口中没有  get.set()这个方法


    }
}
