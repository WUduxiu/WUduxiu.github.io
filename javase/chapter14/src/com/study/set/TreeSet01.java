package com.study.set;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeSet;

/**
 * @date 2022/10/16&15:08
 */
public class TreeSet01 {
    public static void main(String[] args) {
        //1.当我们使用无参构造器创建TreeSet时，排序方式仍然是无序的
        //2.可以使用TreeSet提供的一个构造器，可以传入一个比较器(用匿名内部类来实现，并指定排序的规则)
        /*
      1.创建带有比较器的构造器
             public TreeSet(Comparator<? super E> comparator) {
                    this(new TreeMap<>(comparator));
            }
      2.
      public boolean add(E e) {
        return m.put(e, PRESENT)==null;
    }
       3.
        public V put(K key, V value) {
        Entry<K,V> t = root;
        if (t == null) {
            compare(key, key); // type (and possibly null) check

            root = new Entry<>(key, value, null);
            size = 1;
            modCount++;
            return null;
        }
        int cmp;
        Entry<K,V> parent;
        // split comparator and comparable paths
        Comparator<? super K> cpr = comparator;
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
         */
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //先向下转型 将Object o1, Object o2 转为String类型
                /*
                这边进行循环排序比较 如果return返回的值是0 那么就不能添加成功
                 */
                return ((String)o1).length()-((String)o2).length();//默认是按从小到大
            }
        });
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");
        treeSet.add("b");
        System.out.println(treeSet);

    }
}
