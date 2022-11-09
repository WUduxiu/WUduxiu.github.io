package com.study.list;

/**
 * @date 2022/10/14&19:41
 */
public class LinkedList01 {
    public static void main(String[] args) {
      //创建三个结点
      Node node1 = new Node("jack");
      Node node2 = new Node("tom");
      Node node3 = new Node("lucy");
      Node newNode = new Node("insert");
      //连接三个结点 形成双向链表
      //node1-->node2-->node3
      node1.next = node2;
      node2.next = node3;
      //node3-->node2->node1
      node3.pre = node2;
      node2.pre = node1;
      //插入新元素 实际上就是改变指向
      node2.next = newNode;
      newNode.next = node3;
      node3.pre = newNode;
      newNode.pre = node2;

      Node first = node1;//让first引用指向 node1，就是指向双向链表的头结点
      Node last = node3;//让last引用指向 node2，就是指向双向链表的尾结点

      //从头到尾遍历循环
      System.out.println("从头到尾循环遍历");
      while (true){
        if (first==null){
          break;
        }
        System.out.println(first);
        first = first.next;
      }
      System.out.println("从尾到头循环遍历");
      while (true){
        if (last==null){
          break;
        }
        System.out.println(last);
        last = last.pre;
      }

    }
}
//定义一个Node类 ，Node对象 表示双向链表的一个结点
class Node{
  public Object item;//真正存放数据的地方
  public Node next;//指向下一个节点
  public Node pre;//指向上一个节点

  public Node(Object item) {
    this.item = item;
  }

  @Override
  public String toString() {
    return "name=" + item;
  }
}
