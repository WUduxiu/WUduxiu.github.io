package com.study.枚举enum_;

/**
 * @date 2022/10/6&20:06
 */
public class enum关键字实现枚举Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season3.SPRING);
        System.out.println(Season3.What);
    }
}
//使用enum关键字来实现枚举类 默认会继承Enum类是一个final类
//
enum  Season3{
    SPRING("春天","温暖"),SUMMER("夏天","炎热"),
        What;         //通过实参看调用那个构造器 例如What
    //如果使用的是无参构造器创建常量对象，则可以省略()
    /*
        1.如果使用enum关键字来实现枚举，要求将定义常量对象写在最前面
        2.直接使用 不用再创建对象 例如:SPRING("春天","温暖") =  常量名(形参)
        3.如果有多个常量对象 用,逗号间隔即可
        4.使用enum关键字代替 class
     */
    private String name;
    private String des;//描述

   private Season3(String name, String des) {
        this.name = name;
        this.des = des;
    }
    private Season3(){

    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getDes() {
        return des;
    }

//    public void setDes(String des) {
//        this.des = des;
//    }

    @Override
    public String toString() {
        return "Season3{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
