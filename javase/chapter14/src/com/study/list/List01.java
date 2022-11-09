package com.study.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/10/13&19:15
 */
public class List01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        //1.List集合类中元素是有序的(即添加顺序和取出顺序是一致的) 并且是可以重复的
        arrayList.add("0");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("1");//存在两个元素 "1"
        System.out.println(arrayList);
        //2.List集合中的每个元素都有其对应的顺序索引，即支持索引  索引从0开始
        Object o = arrayList.get(0);//根据索引取得是一个Object对象
        System.out.println(arrayList.get(2));//2
        //实现了List接口的实现类有很多  常用的有 ArrayList LinkedList Voctor

    }
}
