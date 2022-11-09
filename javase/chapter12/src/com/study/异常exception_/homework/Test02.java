package com.study.异常exception_.homework;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * @date 2022/10/9&22:38
 */
public class Test02 {
    public static void main(String[] args) {
        //args[4] = null;//NullPointerException  传入5个数后会发生空指针异常
        if (args[4].equals("jack")){//ArrayIndexOutOfBoundsException 此时args.length = 0
            System.out.println("AA");
        }else {
            System.out.println("BB");
        }
        Object o = args[2];//String[] args 字符串数组   相当于Object o = new String();向上转型
        //向下转型  String i = (Integer) o;
        Integer i = (Integer) o;//一定发生类转换异常 ClassCastException
    }
}
