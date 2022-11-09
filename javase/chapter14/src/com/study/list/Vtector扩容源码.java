package com.study.list;

import java.util.List;
import java.util.Vector;

/**
 * @date 2022/10/14&19:20
 */
public class Vtector扩容源码 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i = 1; i <=10 ; i++) {
            vector.add(i);
        }
        for (int i = 11; i <=20 ; i++) {
            vector.add(i);
        }
        /*
        1.进入无参构造器
        public Vector() {
        this(10);
        }
        2.进入有参构造器
        public Vector(int initialCapacity) {
        this(initialCapacity, 0);
        }
        3.this.elementData = new Object[initialCapacity];
        4.ensureCapacityHelper(elementCount + 1);
        5.if (minCapacity - elementData.length > 0)//判断是否要扩容
            grow(minCapacity);
        }
        6. private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        真正实现扩容的地方：
        int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
                                         capacityIncrement : oldCapacity);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
         */

    }
}
