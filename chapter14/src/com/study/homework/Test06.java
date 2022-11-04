package com.study.homework;

import java.util.HashSet;
import java.util.Objects;

/**
 * @date 2022/10/17&10:29
 */
@SuppressWarnings("all")
public class Test06 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person1 p1 = new Person1("AA", 1001);
        Person1 p2 = new Person1("BB", 1002);
        set.add(p1);
        set.add(p2);
        p1.setName("CC");
        set.remove(p1);//删除也是格局hash值来定位 此时hash值应该是Objects.hash(CC, 1001);
                        //运算出来的hash值和前面的不同 就删除失败 p1还保存在表中
        set.add(new Person1("CC",1001));//运算的hash值不同，存放的索引也会不同
        System.out.println(set);
        set.add(new Person1("AA",1001));//和p1运算出来的hash值相同，存放在相同的索引
        // 但是此时的p1(name=CC,num=1001) 新的对象(name=AA,num=1001) equasl比较结果不同 就挂载到p1的后面
        System.out.println(set);
    }
}
class Person1{
    private String name;
    private int num;

    public Person1(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "\nPerson1{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return num == person1.num && Objects.equals(name, person1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num);
    }
}
