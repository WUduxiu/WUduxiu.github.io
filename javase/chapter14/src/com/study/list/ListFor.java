package com.study.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @date 2022/10/13&19:55
 */
public class ListFor {
    public static void main(String[] args) {
        //List集合的三种遍历方式
        //1.使用迭代器 iterator
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.print(next);
        }
        System.out.println(" ");
        for (Object o : list) {
            System.out.print(o);
        }
        System.out.println("");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }


    }
}
