package com.study.map;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @date 2022/10/16&15:40
 */
public class TreeMap01 {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new Comparator() {
            /*
     1.创建构造器
                public TreeMap(Comparator<? super K> comparator) {
                    this.comparator = comparator;
                }
     2.第一次添加
             public V put(K key, V value) {
        Entry<K,V> t = root;
        if (t == null) {
            compare(key, key); // type (and possibly null) check

            root = new Entry<>(key, value, null);
            size = 1;
            modCount++;
            return null;
        }
    3.第二次添加
            Comparator<? super K> cpr = comparator;
        if (cpr != null) {
            do {  //遍历所有的key
                parent = t;
                cmp = cpr.compare(key, t.key);//动态绑定
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else  //如果遍历过程中 发现准备添加的Key和 当前已有的Key相同 就返回
                    return t.setValue(value);
            } while (t != null);
        }
             */
            @Override
            public int compare(Object o1, Object o2) {
                //按照key的字符串大小排序
//                return ((String)o1).compareTo((String) o2);
                //当满足return 0  表示俩个key的值相同 就不会添加进treeMap中会发生替换
                return ((String)o1).length()-((String)o2).length();//按照key的字符串长度排序
            }
        });
        treeMap.put("jack","杰克");
        treeMap.put("tom","汤姆");
        treeMap.put("smith","史密斯");
        treeMap.put("lucy","露西");
        System.out.println(treeMap);
    }
}
