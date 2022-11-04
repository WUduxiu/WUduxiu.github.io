package com.study.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/10/13&22:48
 */
public class 源码ArrayListSource {
    public static void main(String[] args) {
        /*
        transient Object[] elementData;  transient表示不被序列化
        private static final int DEFAULT_CAPACITY = 10;
         */
        ArrayList list = new ArrayList(8);//无参的集合默认初始化容量是10
                // (JDK8以后优化：底层先创建一个长度为0的数组，当添加第一个元素的时候，初始化容量10)
       // System.out.println(list.size());// 容量和数量不是一个概念
        /*
        int newCapacity = oldCapacity + (oldCapacity >> 1); 位运算
        当数组长度超过10后，需要扩容就按默认数组的1.5倍增长


         */
        //添加1-10个元素
        for (int i = 1; i <=10 ; i++) {
            list.add(i);
        }
        /*
        private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)//第一次扩容会进入
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        elementData = Arrays.copyOf(elementData, newCapacity);//真正实现扩容的地方

    }
         */
        //添加11-15个元素
        for (int i = 11; i <=15 ; i++) {
            list.add(i);
        }
        list.add(16);

        List list1 = new ArrayList(20);//list1的集合初始容量就是20
                                                    //如果需要口扩容就直接是 20*1.5

    }
}
