package com.study.map;

import java.util.HashMap;
import java.util.Set;

/**
 * @date 2022/10/15&21:17
 */
@SuppressWarnings("all")
public class Map源码解析 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("one",1);
        hashMap.put("two",2);
        /*
        1.K-V 最后是存放在HashMap$Node(HashMap的静态内部类Node) node = newNode(hash,key,value,null)
        2.k-v为了方便程序员的遍历，还会创建 EntrySet集合 ，该集合存放的元素类型是 Entry，
          而一个Entry对象就有k-v EntrySet<Entry<k,v>> 即：transient Set<Map.Entry<K,V>> entrySet
        3.entrySet中，定义的类型是 Map.Entry，但实际上存放的还是 HashMap$Node
        4.因为static class Node<k,v> implments Map.Entry<k,v>
        5.当把HashMap$Node对象 存放到entrySet 就方便我们的遍历 因为Map.Entry提供了  K getKey();和 V getValue();
         */
        Set set = hashMap.entrySet();
        System.out.println(set.getClass());//运行类型是HashMap$EntrySet
    }
}
