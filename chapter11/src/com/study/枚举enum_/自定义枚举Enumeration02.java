package com.study.枚举enum_;

/**
 * @date 2022/10/6&19:40
 */
public class 自定义枚举Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season2.SUMMER);

    }
}
//演示自定义枚举
class Season2{
    private String name;
    private String desc;//添加描述
    //final修饰的属性是一个常量  通常全部大写
    public static final Season2 SPRING =  new Season2("春天","温暖");
    public static final Season2 SUMMER =  new Season2("夏天","炎热");

/*
  1.将构造器私有化，使外部无法新建实例对象
  2.去掉Set方法，防止属性被修改 枚举对象通常只读
  3.在Season类内部，直接创建固定对象 [创建常量数组]
  4.底层优化 加上final修饰符  static+final实现底层优化
 */
    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

//    public void setDesc(String desc) {
//        this.desc = desc;
//    }
}
