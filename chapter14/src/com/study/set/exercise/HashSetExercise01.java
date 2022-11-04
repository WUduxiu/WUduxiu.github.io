package com.study.set.exercise;

import java.util.HashSet;
import java.util.Objects;

/**
 * @date 2022/10/15&15:44
 */
public class HashSetExercise01 {
    public static void main(String[] args) {
        Employee jack = new Employee("jack", 20);
        Employee lucy = new Employee("jack", 20);
        Employee tom = new Employee("jack", 25);
        HashSet set = new HashSet();
        set.add(jack);
        set.add(lucy);
        set.add(tom);
        System.out.println(set);

    }
}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        //name 和 age 内容相同就返回ture
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {//输入的 name属性和age属性都相同就返回相同的 hash值

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
