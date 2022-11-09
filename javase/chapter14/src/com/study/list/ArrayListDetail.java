package com.study.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/10/13&21:38
 */
@SuppressWarnings("all")
public class ArrayListDetail {
    public static void main(String[] args) {
        List list = new ArrayList();
        /*
        ArrayList是线程不安全的，没有用synchronized修饰 线程不安全
        ArrayList基本等同于Vector,除了ArrayList是线程不安全的(执行效率高) 多线程的情况下不使用ArrayList
         */
        list.add(null);//list集合可以添加null 并且可以添加多个
        list.add(null);
        System.out.println(list);
    }
}
