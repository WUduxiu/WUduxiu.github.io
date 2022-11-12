package com.bjpowernode.spring6.bean;

/**
 * @date 2022/10/28&22:02
 *  表示一个学生
 */
public class Student {
    private String name;
    private Clazz clazz;//学生有一个班级属性

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
