package com.study.set;

import java.util.HashSet;
import java.util.Objects;

/**
 * @date 2022/10/15&15:14
 */
@SuppressWarnings("all")
public class HashSet扩容机制实现 {
    public static void main(String[] args) {
        //1.
        //每次加入的结点都算 每次都加到同一个索引位置也算
        //第一次添加到16 到达临界值16*0.75=12 就进行扩容 扩容到32 到32*0.75=24 再进行扩容到64 如此类推
        //根据hashcode计算得到的 hash值可能相同也可能不同 可能会在相同的索引上
        HashSet set = new HashSet();
        for (int i = 1; i <=100 ; i++) {
            set.add(i);
        }
        //2.模拟红黑树化
        //保证每次添加进去的key的 hashcode值相等 就能保证每次都加到Node[]的同一个索引上
        //当索引上的一条链表上的结点为8时 ，并不会马上树化 而是先判断table表的大小是否>64
        //如果小于64 一边在链表上继续添加一边对表进行扩容按上面的机制进行扩容
        //如果table表的大小 >=64 就进行树化
        HashSet set1 = new HashSet();
        for (int i = 1; i <=7 ; i++) {
            set1.add(new A(i));
        }
        for (int i = 1; i <=7 ; i++) {
            set1.add(new B(i));
        }
    }
}
class A{
    public int i;

    public A(int i) {
        this.i = i;
    }


    @Override
    public int hashCode() {
        return 100;
    }
}
class B{
    public int i;

    public B(int i) {
        this.i = i;
    }
    @Override
    public int hashCode() {
        return 200;
    }
}
