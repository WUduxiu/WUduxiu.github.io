package com.study.reflect.获取字节码Class;

import java.util.Date;

/**
 * @date 2022/10/22&15:25
 *
 */
public class ReflectTest01 {
    public static void main(String[] args) {
        //要操作一个类的字节码，需要首先获取到这个类的字节码，怎么获取java.lang.Class实例
        /*
        Class.forName()
        1.是一个静态方法
        2.方法的参数是一个字符串
        3.字符串是一个类的完整类名
        4.完整类名必须带有包名，java.lang也不能省略
         */
        //得到Class的第一种方式 Class.forName(”包名.类名全称“)
        Class<?> c1 = null;
        try {
          c1 = Class.forName("java.lang.String");//c1代表 jdk8里面的 String.class 或者说c1代表String类型
            Class<?> c2 = Class.forName("java.lang.Integer");//代表Integer类型
            Class<?> c3 = Class.forName("java.util.Date");//代表Date类型
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //得到Class的第二种方式  对象引用.getClass()方法
        String s = "abc";
        Class<? extends String> x = s.getClass();
        //x 和 c1 两个变量保存的内存地址都是一样的，都指向方法区中的字节码文件
        System.out.println(x==c1);//(==)判断的实际上是两个变量的内存地址

        //第三种方式 java语言中任何一种类型，包括基本数据类型，都有Class属性
        Class a = String.class;  //a代表 String类型
        Class b = int.class;     //b 代表 int类型
        Class c = Date.class;   //c代表 Date类型
        System.out.println(a==x);//t



    }
}
