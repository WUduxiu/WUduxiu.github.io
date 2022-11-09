package com.study.异常exception_;

import java.util.Date;

/**
 * @date 2022/10/7&20:18
 */
public class ExceptionExercise {
 public static void main(String[] args) {


 }
}
class Person{
    public static void main(String[] args) {
        Object obj = new Date();
        try {
            Person person;
            person = (Person) obj;//类转换异常  obj对象的运行内存为Date()不是Person
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
