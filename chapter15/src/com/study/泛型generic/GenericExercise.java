package com.study.泛型generic;

import java.util.*;

/**
 * @date 2022/10/16&20:22
 */
public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack",21));
        students.add(new Student("tom",22));
        students.add(new Student("lucy",23));
        for (Student student : students) {
            System.out.println(student);
        }
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student next =  iterator.next();
            System.out.println(next);
        }
        HashMap<String, Student> hashMap = new HashMap<>();
        hashMap.put("jack",new Student("jack",20));
        hashMap.put("tom",new Student("tom",21));
        hashMap.put("lucy",new Student("lucy",22));
        Set<String> strings = hashMap.keySet();
        for (String o :strings) {
            System.out.println(o+"-"+hashMap.get(o));
        }
        Set<Map.Entry<String, Student>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Student> next = iterator1.next();
            System.out.println(next.getKey()+"-"+next.getValue());
        }
        System.out.println("---------------");
        for (Map.Entry o :entries) {
            System.out.println(o.getKey()+"-"+o.getValue());
        }


    }
}
class Student{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
