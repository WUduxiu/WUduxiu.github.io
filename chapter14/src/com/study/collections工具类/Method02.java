package com.study.collections工具类;

import java.util.*;

/**
 * @date 2022/10/16&16:17
 */
@SuppressWarnings("all")
public class Method02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("simith");
        list.add("king");
        list.add("milan");
        list.add("tom");
        //根据元素的自然排序(按字符串大小)，返回给定集合中的最大元素
        System.out.println(Collections.max(list));
        //返回长度最大的元素
        System.out.println(Collections.max(list, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        }));
        //min和上面max类似
        //返回指定集合中某个元素出现的次数
        System.out.println("List集合中tom出现的次数="+Collections.frequency(list,"tom"));
        //集合的赋值
        List list1 = new ArrayList();
        //为了完成完整的拷贝，先需要给list1赋值，保证list1和list的元素个数相同
        for (int i = 0; i < list.size(); i++) {
            list1.add("");
        }
        Collections.copy(list1,list);
        System.out.println(list1);
        //替换 用新值替换List对象的所有旧值
        Collections.replaceAll(list,"tom","newwom");//用新值替换旧的值
        System.out.println(list);
    }
}
