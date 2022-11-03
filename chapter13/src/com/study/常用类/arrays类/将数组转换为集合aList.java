package com.study.常用类.arrays类;



import java.util.Arrays;
import java.util.List;

/**
 * @date 2022/10/12&17:13
 */
public class 将数组转换为集合aList {
    public static void main(String[] args) {
        //编译类型是 List(接口)
        List list = (List) Arrays.asList(23,5,6,7);
        System.out.println("list="+list);
        System.out.println("list的运行类型"+list.getClass());
        /*
        private static class ArrayList<E> extends AbstractList<E>
        implements RandomAccess, java.io.Serializable
         */
        //运行类型是 java.util.Arrays的一个静态内部类 ArrayList
    }
}
