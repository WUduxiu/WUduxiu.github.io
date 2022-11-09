package com.study.map;

import java.util.HashMap;

/**
 * @date 2022/10/15&20:50
 */
@SuppressWarnings("all")
public class Map01 {
    public static void main(String[] args) {
        //Map接口实现类的特点--使用HashMap
        /*
        1.Map用于保存具有映射关系的数据(Key-Value 双列元素)
        2.Map里面的Key的存放还是按照 hash值来存放的
        3.Map中的Key值不允许重复，当有相同的key时就等价于替换
        4.Map中的Value可以重复
        5.Map中的key 可以为null，value也可以为null 但是key为null只能有一个，value可以有多个null
        6.常用String类作为Map的key
        7.Key和value之间存在单向一对一的关系，即通过指定的Key总能找到对应的value
         */
        HashMap hashMap = new HashMap();
        hashMap.put("one",1);
        hashMap.put("two",2);
        hashMap.put("one",3);//发生替换  替换前面的one
        hashMap.put("three",3);//Value的值可以重复
        System.out.println(hashMap);
        System.out.println(hashMap.get("one"));//通过找到key的值返回 value的值

    }
}
