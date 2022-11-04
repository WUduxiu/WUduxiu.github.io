package com.study.homework;

import java.util.TreeSet;

/**
 * @date 2022/10/17&9:46
 */
@SuppressWarnings("all")
public class Test05 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        //实现了接口方法以后 因为返回值为0
        //就无法添加新的元素 就始终只有一个元素
        treeSet.add(new Person());//发生异常ClassCastException
        treeSet.add(new Person());
        treeSet.add(new Person());
        treeSet.add(new Person());
        System.out.println(treeSet);

        /*
        add方法
        因为使用TreeSet的 add方法时，要么自己传入一个实现了Comparetor的匿名内部类
        没有传入一个实现了Comparetor的匿名内部类时
        底层：Comparable<? super K> k = (Comparable<? super K>) key;
        即尝试把一个Person对象 转成 Comparable<? super K>类型
        因为Person对象没有实现Comparable<? super K>接口，就会发生类型转换异常ClassCastException

         */
    }
}
class Person implements Comparable<Person>{

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
