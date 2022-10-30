package com.study.类详解object_;

public class EqualsExercise {
    public static void main(String[] args) {
        Person person1 = new Person("jack",20,'男');
        Person person2 = new Person("Jack", 20, '男');
        Person person3 = person1;
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person2.equals(person3));
        //因为此时的equals方法是继承Object中的方法  并没有重写
        //只是比较俩个对象的是否相同（比较地址是否相同）
    }
}
class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public boolean equals(Object object){
        if (this == object){//此时的this指的是Person类
            return true;
        }
        //判断类型
        if (object instanceof Person){
            //向下转型  为了能直接使object对象调用属性
            return this.name.equals(((Person) object).name)&&this.age==((Person) object).age
                    &&this.gender==((Person) object).gender;
        }
        return false;

    }
}
