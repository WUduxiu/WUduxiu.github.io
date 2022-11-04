package com.study.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @date 2022/10/13&17:18
 */
public class CollectionMethod {
    public static void main(String[] args) {
        Collection List = new ArrayList();//用接口来接收
        //List添加单个元素
        List.add("jack"); //add()方法里面添加的是 Object对象，只要是Object的子类都可以添加(向下转型)
        List.add(123);//有一个自动装箱的过程  add(new Integer(123))  int---->Integer
        List.add("jack");
        List.add(true);
        /*
        o.equals(elementData[index])
        remove删除底层源码是用equals进行比较  String类型就是判断内容是否相等 如果有俩个相同的值 删除前面的
         */
        System.out.println("删除前"+List);
        List.remove("jack");
        //Object remove = List.remove(0);//删除索引下标返回的是 被删除的对象
       // boolean remove1 = List.remove(Integer.valueOf(123));//删除对象返回的是一个 boolean值
        System.out.println("删除后"+List);
        //查找元素是否存在  contains()底层调用的是equals方法进行比对 添加的元素的equals()方法
        /*
        o.equals(elementData[i]
         */
        //此时元素为String String的equals 比较的就是内容是否相等
        System.out.println(List.contains("jack"));//f
        //获取集合中 元素的个数 size()
        System.out.println(List.size());//1
        //判断数组是否为空  isEmpty()
        System.out.println(List.isEmpty());//f
        //清空集合中的所有元素
        List.clear();
        System.out.println(List);
        //addAll 添加多个元素(添加一个实现了Collection接口的集合)
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        List.addAll(list2);
        System.out.println(List);
        //删除多个元素
        List.removeAll(list2);
        System.out.println(List);

    }
}
