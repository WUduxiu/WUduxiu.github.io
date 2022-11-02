package com.study.异常exception_.常见的运行异常;

/**
 * @date 2022/10/7&17:31
 */
public class 类型转换异常ClassCastException {
   public static void main(String[] args) {
       A b = new B();//向上转型
       B b1 = (B) b;//向下转型
       System.out.println(b.getClass());//b的运行类型
       System.out.println(b1.getClass());//b1的运行类型
       try {
           C c1 = (C) b;//抛出异常
       } catch (Exception e) {
           //e.printStackTrace();
           System.out.println("抛出异常类型为类型转换异常"+e.getMessage());
       }
       System.out.println("程序继续运行");
   }
}
class A{}
class B extends A{}
class C extends A{}
