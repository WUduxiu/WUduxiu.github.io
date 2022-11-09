package com.study.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/10/13&19:25
 */
public class ListMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("0");
        list.add("2");
        list.add(1,"1");//在集合 索引为1的位置插入元素 "1" 如果前面没有加索引，默认加到最后
        System.out.println(list);
        //在集合下标为1的位置 加入一个集合
        ArrayList list1 = new ArrayList();
        list1.add("jack");
        list1.add("tom");
        list.addAll(1,list1);
        System.out.println(list);
        //返回集合中索引为0的元素
        Object o = list.get(0);
        System.out.println(o);
        //indexOf返回集合中该元素首次出现的位置
        //lastIndexOf返回集合中该元素最后一次出现的位置
        list.add("tom");
        int i = list.indexOf("jack");
        int j = list.lastIndexOf("tom");
        System.out.println("集合中 jack首次出现的位置"+i);
        System.out.println("集合中最后一次出现tom的位置"+j);
        //删除集合中的元素
        list.remove(0);
        System.out.println(list);
        //替换集合中的元素  如果索引不存在就抛出异常
        list.set(0,"lucy");
        System.out.println(list);
        //返回一个子集合  返回的子集合是一个前闭后开的子集合
        List list2 = list.subList(0, 1); //相当于是[0,1)
        System.out.println(list2);

    }
}
