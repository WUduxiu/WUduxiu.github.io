package com.study.set;

import javax.swing.tree.TreeNode;
import java.util.HashSet;
import java.util.Set;

/**
 * @date 2022/10/14&22:15
 */
@SuppressWarnings("all")
public class HashSet添加实现底层原理 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("java");
        set.add("php");
        set.add("java");
        System.out.println("set="+set);
        /*
        HashSet源码解读
        1.执行的构造器
        public HashSet() {
            map = new HashMap<>();
        }
        2.执行add()方法
        public boolean add(E e) {  E是指泛型  e是指传入的对象 此时是"java"
             return map.put(e, PRESENT)==null;  //返回的是null 就代表添加的元素原先不存在 表示添加成功
             //private static final Object PRESENT = new Object(); 起到占位作用
        }
        3.执行put()方法
         public V put(K key, V value) {  key就是传入的值  value就是PRESENT 起到占位作用
         //value始终都是不变的 key是变化的根据每次出传入的值
                return putVal(hash(key), key, value, false, true);
        }
        4.计算key的hash值 不是完全等价Key的hashcode值，
        static final int hash(Object key) {
             int h;
             return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);//算术右移16格，防止h重复
        }
        5.执行putValue()
            final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                       boolean evict) {
            Node<K,V>[] tab; Node<K,V> p; int n, i;  //定义了辅助变量
            //下面的table 就是HashMap的一个数组，类型是Node[]  如果table=null 就进入 第6步resize()
            //if语句表示当前table是null ，或者大小=0 就是第一次扩容 扩容到16个空间
            if ((tab = table) == null || (n = tab.length) == 0)
                n = (tab = resize()).length;
                //第6步返回新的数组后，
                //就开始计算key对应的hash值 应该存放的位置(table表的哪一个索引位置去存放)
                //2.判断p是否为null
                //2.1如果为null 表示当前索引还没有存放元素，就创建一个Node
               // 2.2tab[i] = newNode(hash, key, value, null);
            if ((p = tab[i = (n - 1) & hash]) == null)
                tab[i] = newNode(hash, key, value, null); // 存放的有hash值，key传入的对象  hash值用于以后的比较
                                                               如果相等就挂载到这个结点上，不相等就不在该索引存放
                                                           //value就是PRESENT 起到占位作用
            else {
                Node<K,V> e; K k;
                满足下面俩个条件之一  就不能加入
    1. //如果当前索引位置对应的链表的第一个元素，和准备添加的key的hash值一样 ，
      //  并且满足，准备加入的key和p指向的结点中的key是同一个对象
    2.//如果key不等于null 并且准备加入的key和p指向的结点中的key内容相同  key.equals(k) 根据key的equals方法比较(动态绑定)

                if (p.hash == hash &&
                    ((k = p.key) == key || (key != null && key.equals(k))))
                    e = p;
          //再判断 p 是不是一颗红黑树 如果是一颗红黑树 就按putTreeVal(this, tab, hash, key, value)进行添加
                else if (p instanceof TreeNode)
                    e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
      //如果table对应的索引位置正好是一条链表，就使用for循环 不停的比较，如果每一个都不相同就挂载到最后一个结点上
      //在把元素添加到链表后，立刻判断 if (binCount >= TREEIFY_THRESHOLD(8) - 1)如果大于
      //就进入 treeifyBin(tab, hash); 在这个方法里面判断是否要对当前链表进行(红黑树化)
      //只有当上面的条件都不满足才能当前链表进行(红黑树化) 否就进入resize();
      //if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY(64))
      //            resize();
      //如果在比较的过程中，有一个结点中的key相同 就break； 放弃添加
                else {
                    for (int binCount = 0; ; ++binCount) {
                        if ((e = p.next) == null) {
                            p.next = newNode(hash, key, value, null);
                            if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                treeifyBin(tab, hash);
                            break;
                        }
                        if (e.hash == hash &&
                            ((k = e.key) == key || (key != null && key.equals(k))))
                            break;
                        p = e;//结点下移
                    }
                }
            //如果e不等于 null    if (e != null) { // existing mapping for key
                    V oldValue = e.value;
                    if (!onlyIfAbsent || oldValue == null)
                        e.value = value;
                    afterNodeAccess(e);
                    return oldValue;//都不满足就返回就数组  表示添加失败
                }
            }
            ++modCount;  //修改的次数
            if (++size > threshold) //Node[]数组当前的元素个数=1 > 临界值12 如果大于就进入resize();
                resize();
            afterNodeInsertion(evict);//HashMap留给子类做实现的  对于HashMap来说是空方法
            return null;  //返回null代表成功
        }
        6. 当table = null 是执行resize()
            final Node<K,V>[] resize() {
            Node<K,V>[] oldTab = table;
            int oldCap = (oldTab == null) ? 0 : oldTab.length;
            int oldThr = threshold;
            int newCap, newThr = 0;
            if (oldCap > 0) {
                if (oldCap >= MAXIMUM_CAPACITY) {
                    threshold = Integer.MAX_VALUE;
                    return oldTab;
                }
                else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&
                         oldCap >= DEFAULT_INITIAL_CAPACITY)
                    newThr = oldThr << 1; // double threshold
            }
            else if (oldThr > 0) // initial capacity was placed in threshold
                newCap = oldThr;
            else {               // zero initial threshold signifies using defaults
                newCap = DEFAULT_INITIAL_CAPACITY;
             newThr = 临界值：需要扩容的值*0.75   这里=16*0.75 = 12 当使用了12个位置时就准备开始扩容 可以防止阻塞
               newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY);
            }
            if (newThr == 0) {
                float ft = (float)newCap * loadFactor;
                newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
                          (int)ft : Integer.MAX_VALUE);
            }
            threshold = newThr;
            @SuppressWarnings({"rawtypes","unchecked"})
                Node<K,V>[] newTab = (Node<K,V>[])new Node[newCap]; //new 一个Node类型的数组 大小为16
            table = newTab;//赋值
            if (oldTab != null) {
                for (int j = 0; j < oldCap; ++j) {
                    Node<K,V> e;
                    if ((e = oldTab[j]) != null) {
                        oldTab[j] = null;
                        if (e.next == null)
                            newTab[e.hash & (newCap - 1)] = e;
                        else if (e instanceof TreeNode)
                            ((TreeNode<K,V>)e).split(this, newTab, j, oldCap);
                        else { // preserve order
                            Node<K,V> loHead = null, loTail = null;
                            Node<K,V> hiHead = null, hiTail = null;
                            Node<K,V> next;
                            do {
                                next = e.next;
                                if ((e.hash & oldCap) == 0) {
                                    if (loTail == null)
                                        loHead = e;
                                    else
                                        loTail.next = e;
                                    loTail = e;
                                }
                                else {
                                    if (hiTail == null)
                                        hiHead = e;
                                    else
                                        hiTail.next = e;
                                    hiTail = e;
                                }
                            } while ((e = next) != null);
                            if (loTail != null) {
                                loTail.next = null;
                                newTab[j] = loHead;
                            }
                            if (hiTail != null) {
                                hiTail.next = null;
                                newTab[j + oldCap] = hiHead;
                            }
                        }
                    }
                }
            }
            return newTab;
    }
         */
    }
}
