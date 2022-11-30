package com.powernode.myspring.bean;

/**
 * @date 2022/10/31&22:57
 */
public class Vip {
    private String name;
    private int age;
    private double sal;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                '}';
    }
}
