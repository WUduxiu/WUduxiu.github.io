package com.study.常用类.包装类wrapper;

/**
 * @date 2022/10/10&9:40
 */
public class WrapperExercise03 {
    public static void main(String[] args) {
        //1
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1==i2);//f
        //2
        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3==i4);//f
        //3
        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println(i5==i6);//t
        //4
        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7==i8);//f
        //5
        Integer i9 = 127;
        Integer i10 = new Integer(127);
        System.out.println(i9==i10);//f
        //6
        Integer i11 = 127;
        int i12 = 127;
        System.out.println(i11==i12);//只要有基本数据类型(==)判断的就是值是否相等
        //7
        Integer i13 = 128;
        int i14 = 128;
        System.out.println(i13==i14);

    }
}
