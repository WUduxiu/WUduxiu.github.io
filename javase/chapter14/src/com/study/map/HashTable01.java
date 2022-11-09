package com.study.map;

import java.util.Hashtable;

/**
 * @date 2022/10/16&14:25
 */
@SuppressWarnings("all")
public class HashTable01 {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        /*
        hashtable存放的是 键值对即 k-v
        hashtable的键和值都不能为null
        hashtable和hashmap的使用方法基本一样
        hashtable 是线程安全的 ，hashmap是线程不安全的
         */
        hashtable.put("john",100);
       // hashtable.put(null,100);//f
       // hashtable.put("john",null);//f
        hashtable.put("lucy",100);
        hashtable.put("lic",100);
        hashtable.put("lic",88);//替换上面的
        System.out.println(hashtable);
    }
}
