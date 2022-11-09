package com.study.map;

import java.util.HashMap;

/**
 * @date 2022/10/15&21:54
 */
public class MapMethod {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("tom","jack");
        hashMap.put("tom","lucy");//替换 上面的tom 因为key相同
        hashMap.put("lucy","lucy");//value 可以重复
        hashMap.put(null,"lucy");
        hashMap.put("jack",null);
        hashMap.put("jojo",null);
        System.out.println(hashMap);
        //remove:根据key删除
        hashMap.remove(null);
        System.out.println(hashMap);
        //get:根据key获取 value
        System.out.println(hashMap.get("tom"));//lucy
        //size:获取元素个数
        System.out.println("k-v="+hashMap.size());//一对 k-v算一个元素
        //判断 元素个数是否为0
        System.out.println(hashMap.isEmpty());//f
        //根据key 查找 value是否存在  也是看key的equals来判断具体情况
        System.out.println(hashMap.containsKey("jojo1"));

    }
}
