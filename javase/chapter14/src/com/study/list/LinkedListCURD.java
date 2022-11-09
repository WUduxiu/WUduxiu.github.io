package com.study.list;

import java.util.LinkedList;

/**
 * @date 2022/10/14&20:06
 */
@SuppressWarnings("all")
public class LinkedListCURD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        /*
        add()源码
        1.public LinkedList() {} 初始化属性
        2.此时LinkedList属性 first = null;  last = null;
        3.执行添加
        public boolean add(E e) {
        linkLast(e);
        return true;
        }
        4.将新的结点，加入到双向链表的最后
        void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
        }

         */
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("LinkedList"+linkedList);
        linkedList.remove();//默认删除链表中第一个结点
        //linkedList.remove(1); 指定删除链表中的下标为1的元素


    }
}
