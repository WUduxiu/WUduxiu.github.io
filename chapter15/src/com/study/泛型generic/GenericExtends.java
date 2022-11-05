package com.study.泛型generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/10/17&11:39
 */
public class GenericExtends {
    public static void main(String[] args) {
        //泛型没有继承性
        //ArrayList<Object> list = new ArrayList<String>();
        ArrayList<Object> list1 = new ArrayList();
        ArrayList<String> list2 = new ArrayList();
        ArrayList<AA> list3 = new ArrayList();
        ArrayList<BB> list4 = new ArrayList();
        ArrayList<CC> list5 = new ArrayList();
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);


    }
    //(List<?> 任意的泛型类型都可以接收
    public static void printCollection1(List<?> c){//任意的泛型类型都可以接收
        for (Object o :c) {
            System.out.println(o);
        }
    }
    //List<? extends AA> extends表示上限，AA及其子类都可以接收
    public static void printCollection2(List<? extends AA> c){
        for (Object o :c) {
            System.out.println(o);
        }
    }
    //List<? super CC> 表示下限，表示AA类及其父类都可以接收
    public static void printCollection3(List<? super AA> c){
        for (Object o :c) {
            System.out.println(o);
        }
    }
}
class AA{}
class BB extends AA{}
class CC extends BB{}
