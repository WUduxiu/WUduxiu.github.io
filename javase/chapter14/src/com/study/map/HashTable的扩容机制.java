package com.study.map;

import java.util.Hashtable;
import java.util.Map;

/**
 * @date 2022/10/16&14:35
 */
public class HashTable的扩容机制 {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("john",100);
        //hashtable.put(null,100);//异常 NullPointerException
        // hashtable.put("john",null);//异常 NullPointerException
        hashtable.put("lucy",100);
        hashtable.put("lic",100);
        hashtable.put("lic",88);//替换上面的
        System.out.println(hashtable);
        /*
        1.底层有数组 Hashtable$Entry[] 初始化大小为11
        2.临界值 threshold 8 = 11*0.75
        3.扩容： addEntry(hash, key, value, index);  int newCapacity = (oldCapacity << 1) + 1;
        4.private void addEntry(int hash, K key, V value, int index) {
        modCount++;

        Entry<?,?> tab[] = table;
        //
        if (count >= threshold) {
            // Rehash the table if the threshold is exceeded
            rehash();

            tab = table;
            hash = key.hashCode();
            index = (hash & 0x7FFFFFFF) % tab.length;
        }
        5. rehash();
            protected void rehash() {
        int oldCapacity = table.length;
        Entry<?,?>[] oldMap = table;

        // overflow-conscious code
        int newCapacity = (oldCapacity << 1) + 1;
        if (newCapacity - MAX_ARRAY_SIZE > 0) {
            if (oldCapacity == MAX_ARRAY_SIZE)
                // Keep running with MAX_ARRAY_SIZE buckets
                return;
            newCapacity = MAX_ARRAY_SIZE;
        }
        Entry<?,?>[] newMap = new Entry<?,?>[newCapacity];

        modCount++;
        threshold = (int)Math.min(newCapacity * loadFactor, MAX_ARRAY_SIZE + 1);
        table = newMap;

        for (int i = oldCapacity ; i-- > 0 ;) {
            for (Entry<K,V> old = (Entry<K,V>)oldMap[i] ; old != null ; ) {
                Entry<K,V> e = old;
                old = old.next;

                int index = (e.hash & 0x7FFFFFFF) % newCapacity;
                e.next = (Entry<K,V>)newMap[index];
                newMap[index] = e;
            }
        }
    }
         */
    }
}
