package com.study.collections工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @date 2022/10/16&16:02
 */
@SuppressWarnings("all")
public class Method01 {
    public static void main(String[] args) {
        //创建一个ArrayList用于测试
        List list = new ArrayList();
        list.add("tom");
        list.add("simith");
        list.add("king");
        list.add("milan");
        System.out.println("默认排序"+list);
        //1.元素反转  反转List中的元素
        Collections.reverse(list);
        System.out.println("反转排序"+list);
        //2.对List元素进行随机排序
        Collections.shuffle(list);
        System.out.println("随机排序"+list);
        //3.自然排序(按照字符串的大小排序)
        Collections.sort(list);
        System.out.println("自然排序后"+list);
        //4.指定排序 按照字符串的长度大小排序
        Collections.sort(list, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                //因为List接口里面允许key重复
                return ((String)o1).length()- ((String)o2).length();
            }
        });
        System.out.println("指定排序后"+list);
        //5.指定元素交换
        //索引范围不能越界
        Collections.swap(list,0,1);//指定元素索引为 0的元素和 元素索引为1的元素 交换位置
        System.out.println("指定元素交换位置后"+list);
    }
}
