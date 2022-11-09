package com.study.set;

/**
 * @date 2022/10/14&21:34
 */
@SuppressWarnings("all")
public class HashSet底层机制 {
    public static void main(String[] args) {
        /*
        HashSet的底层是HashMap
        HashMap的底层是(数组+链表+红黑树)
        模拟HashSet底层
         */
        //1.创建一个数组，数组的类型是 Node[]
        //有些人也直接把这个数组叫作table 称为表
        Node [] table = new Node[16];
        Node jojo = new Node("jojo", null);
        table[2] = jojo;//将jojo放在table表索引为2的位置上
        Node jack = new Node("jack", null);
        jojo.next = jack;//将jack结点挂载到jojo上
        Node rose = new Node("Rose",null);
        jack.next = rose;//将rose结点挂载到jack上
        Node lucy = new Node("lucy", null);
        table[3] = lucy;//将lucy放在table表索引为3的位置上
        System.out.println("table="+table);



    }
}
class Node{//结点：存储数据，可以指向下一个结点，从而形成链表
    Object item;//用于存放数据
    Node next;//指向下一个结点

    public Node(Object item,Node next) {
        this.item = item;
        this.next = next;
    }
}
