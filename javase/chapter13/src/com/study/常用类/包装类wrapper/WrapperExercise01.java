package com.study.常用类.包装类wrapper;

/**
 * @date 2022/10/9&23:42
 */
public class WrapperExercise01 {
    public static void main(String[] args) {
        Double d = 100d;//自动装箱  Double.valueOf(100d)
        Float f = 1.5f;//自动装箱   Float.valueOf(1.5f)
        Object obj1 = true? new Integer(1) : new Double(2.0);
        /*
        三元运算符:一真大师，结果为ture则输出第一个
        三元运算符是一个整体，此时经度最高的是double(2.0) 所以输出的结果为1.0 而不是1
         */
        System.out.println(obj1);//1.0
        Object obj2;
        if (true)
            obj2 = new Integer(1);
        else
            obj2 = new Double(2.0);
        //因为if else是独立的俩个语句 不是一个整体 不会提升经度
        System.out.println(obj2);//1

    }
}
