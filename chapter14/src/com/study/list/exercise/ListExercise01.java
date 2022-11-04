package com.study.list.exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @date 2022/10/13&19:47
 */
public class ListExercise01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        System.out.println("list="+list);
        list.add(1,"hspdeu");
        Object o = list.get(4);
        Object remove = list.remove(5);
        Object six = list.set(6, "six");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("list="+next);

        }
    }
}
