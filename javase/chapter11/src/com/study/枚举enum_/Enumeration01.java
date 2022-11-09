package com.study.枚举enum_;

/**
 * @date 2022/10/5&23:37
 */
public class Enumeration01 {
    public static void main(String[] args) {
        Season season1 = new Season("春天", "温暖");
        Season season2 = new Season("夏天", "炎热");
        /*
        对于季节而言，他的对象(具体值)应该是固定的四个季节，不会有更多
        按照这种设计模式，不能体现季节是固定的四个对象
        枚举类：把具体对象一个一个列举出来 称为枚举类
         */
    }
}
class Season{
    private String name;
    private String desc;//添加描述

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
