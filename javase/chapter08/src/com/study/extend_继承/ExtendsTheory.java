package com.study.extend_继承;

public class ExtendsTheory {
    public static void main(String[] args) {
        //当子类对象创建成功的话，建立查找关系
        /*
        从最高级依次往下
        1.先加载类信息
        2.在堆里面分配空间（字符串就指向方法区中的常量池的某一个地址，数据就保留在堆中）
        3.将堆中的地址返回到栈中（方法的引用）形成一个指向关系
         */
        Son son = new Son();
        System.out.println(son.name3);
        System.out.println(son.getAge());
        System.out.println(son.hobby);
    }
}
class GrandPa{
    String name3 = "大头爷爷";
    String hobby = "旅游";
}
class Father extends GrandPa{
    String name2 = "大头爸爸";
    private int age = 38;

    public int getAge(){
        return age;
    }
}
class Son extends Father{
    String name1 = "小头儿子";

}

