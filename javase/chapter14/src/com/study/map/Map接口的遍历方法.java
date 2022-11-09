package com.study.map;

import java.util.*;

/**
 * @date 2022/10/15&22:11
 */
@SuppressWarnings("all")
public class Map接口的遍历方法 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("邓超","孙俪");
        hashMap.put("王宝强","马蓉");
        hashMap.put("宋哲","马蓉");
        hashMap.put("张三",null);
        hashMap.put(null,"jack");
        hashMap.put("tom","lucy");
        //第一组:先取出 所有的Key ，通过Key取出对应的Value
        Set keySet = hashMap.keySet();//Set的遍历方式有两种 一种是迭代器，一种是增强for
        System.out.println("------第一种方式-增强for循环-----");
        for (Object key :keySet) {
            System.out.println(key + "-" + hashMap.get(key));
        }
        System.out.println("------第二种方式-通过迭代器------");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + "-" + hashMap.get(key));
        }
        //第二组:取出所有的value 但是不能知道 key
        Collection values = hashMap.values();//Collection的遍历方式有两种
        //1.增强for
        for (Object value :values) {
            System.out.println("value="+value);
        }
        //2.迭代器
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value =  iterator1.next();
            System.out.println("value="+value);

        }
        //第三组 通过EntrySet来获取 key-value
        //EntrySet<Map.Entry<K,V>>
        Set entrySet = hashMap.entrySet(); //先把Node转变成Entry  再把Entry放入到EntrySet里面去
        //1.增强for
        for (Object entry :entrySet) {
            Map.Entry m = (Map.Entry) entry; //先把entry转成 Map.entry 得到提供的方法
            System.out.println(m.getKey() + "-" +m.getValue());
        }
        //2.迭代器
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry =  iterator2.next();
            Map.Entry m = (Map.Entry) entry; //先把entry转成 Map.entry 得到提供的方法
            System.out.println(m.getKey() + "-" +m.getValue());

        }


    }
}
