package com.study.set;

import java.util.LinkedHashSet;

/**
 * @date 2022/10/15&17:18
 */
public class LinkedHashSet01 {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        //取出的顺序和存入的顺序一致  因为底层维护的是一个table(数组加双向链表)
        set.add("1");
        set.add("1");// LinkedHashSet 也不能存入相同内容的元素
        set.add("2");
        set.add("3");
        System.out.println(set);
    }
}
