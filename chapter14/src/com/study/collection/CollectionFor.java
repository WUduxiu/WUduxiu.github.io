package com.study.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @date 2022/10/13&18:55
 */
public class CollectionFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection arrayList = new ArrayList();
        arrayList.add(new Book("三国演义",100));
        arrayList.add(new Book("红楼梦",50));
        //快捷键输出 I
//        for (Object o : arrayList) {
//
//        }

        for(Object book : arrayList){//底层仍然是迭代器 增强for是一个简化版的迭代器
            /*
            将集合arrayList中的  Object对象放入book中
             */
            System.out.println("book="+book);
        }
    }
}
