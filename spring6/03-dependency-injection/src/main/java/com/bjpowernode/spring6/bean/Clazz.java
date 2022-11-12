package com.bjpowernode.spring6.bean;

/**
 * @date 2022/10/28&22:02
 *   表示一个班级
 */
public class Clazz {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "name='" + name + '\'' +
                '}';
    }
}
