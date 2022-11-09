package com.study.homework;

import java.util.TreeSet;

/**
 * @date 2022/10/17&9:01
 */
@SuppressWarnings("all")
public class Test04 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("jack");
        String a = "100";
        /*
        1.如果传入了一个Comparator匿名对象，就使用实现的compare去重
        2.如果没有传入一个Comparator匿名对象，则以添加的对象实现的Compareable接口的compareTo()方法去重
         1.因为String类实现了Comparable<String>接口
            public final class String
        if (cpr != null) {
            do {
                parent = t;
                cmp = cpr.compare(key, t.key);
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else
                    return t.setValue(value);
            } while (t != null);
        }
        else {
            if (key == null)
                throw new NullPointerException();
            @SuppressWarnings("unchecked")
     //使用Comparable的
     因为key实际上就是String类型 实现了Comparable<String>接口
     再调用String类型的compareTo 方法
        Comparable<? super K> k = (Comparable<? super K>) key;
            do {
                parent = t;
                cmp = k.compareTo(t.key);
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else
                    return t.setValue(value);
            } while (t != null);
        }
         implements java.io.Serializable, Comparable<String>, CharSequence {
         */
        System.out.println(treeSet);
    }
}
