package com.study.常用类.包装类wrapper;

/**
 * @date 2022/10/10&8:32
 */
public class IntegerIntoString {
    public static void main(String[] args) {
        //包装类(Integer)---->String
        Integer i = 100;//自动装箱  Integer integer = new Integer(100);
                                // Integer integer = Integer.valueOf(i);
        //方式1
        String str1 = i + "";//实际上 i 还是int类型 不是String类型
        //方式2
        String str2 = i.toString();
        //方式3
        String str3 = String.valueOf(i);

        //String---->/包装类(Integer)
        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4);//使用到自动装箱
        /*
        Integer.parseInt(str4)实际上是int类型的数据
        int---->Integer(包装类)：
        Integer integer = new Integer(100);//第一种自动装箱
        Integer integer = Integer.valueOf(i);//第二种自动装箱
         */
        Integer i3 = new Integer(str4);
        System.out.println("ok");



    }
}
