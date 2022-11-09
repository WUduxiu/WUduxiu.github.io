package com.study.类详解object_;

public class ToString {
    public static void main(String[] args) {
        /*
        Object的 toString源码
        getClass().getName()  类的全类名（包名+类名）
        Integer.toHexString(hashCode() 将对象的hashCode值转为16进制的字符串
         public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
         */
        Monster jack = new Monster("jack", 20);
        //输出包名加类名 以及该对象hashCode的16进制写法
        System.out.println(jack.toString());
        System.out.println(jack);//输出类名 默认调用Object类中的toString方法
        System.out.println(jack.hashCode());

    }
}
class Monster{
    private String name;
    private int age;
    //重写toString方法 输出对象属性值

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Monster(String name, int age) {
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
}
