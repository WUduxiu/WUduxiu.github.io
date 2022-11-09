package com.study.主方法main_;

public class Main01 {
    private static int n1 = 100;
    public int n2 = 200;
    public static void hi(){
        System.out.println("静态方法hi()");
    }
    public void hello(){
        System.out.println("普通方法hello()");
    }
    public static void main(String[] args) {//该类的main方法是被java虚拟机调用
        // java Main01 运行这个类的时候
        //java  Main01 jack  mary  这俩个是传入的形参 可以通过for循环args这个数组来显示出来
        System.out.println(n1);//静态方法可以直接调用静态变量
        //System.out.println(n2);
        Main01 main01 = new Main01();
        System.out.println(main01.n2);//静态main方法，访问本类的非静态成员，需要先创建对象，再调用
        hi();
        //hello();
        main01.hello();
    }
}
