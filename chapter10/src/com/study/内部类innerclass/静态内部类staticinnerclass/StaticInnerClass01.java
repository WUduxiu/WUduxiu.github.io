package com.study.内部类innerclass.静态内部类staticinnerclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
        //外部其他类访问静态内部类
        //方式1：new 外部类类名.内部类类名来创建
        //因为静态成员可以通过类名.的方式来访问的(前提是修饰符满足访问)
        Outer.Inner inner1 = new Outer.Inner();
        inner1.say();
        //方式2：在外部类中编写一个普通方法，可以返回静态内部类的一个实例，通过外部类对象去调用
        Outer.Inner inner2 = outer.getInner();
        inner2.say();
        //方式3：在外部类中编写一个静态方法，返回静态内部类的一个实例，通过外部类名.方法名调用
        Outer.Inner inner3 = Outer.getStaticInner();
        inner3.say();
    }
}
class Outer{
    private int n1 = 10;
    private static String name = "外部类的静态属性张三";
    /*
    静态成员内部类：
    1.使用static修饰，放在成员位置上
    2.可以访问外部类的所有静态成员，包括私有的静态成员，但是不能访问非静态成员
    3.可以添加修饰符(public protected 默认修饰符 private)
    4.作用域为整个类体
     */
    static class Inner{
        private static String name = "内部类的静态属性张三";
        private String name1 = "李四";
        public void say(){
            //System.out.println(n1);无法访问非静态属性n1
            System.out.println(name);
            System.out.println(Outer.name);
            System.out.println(name1);
        }
    }
    public void test(){
        Inner inner = new Inner();
        inner.say();
    }
    public Inner getInner(){
        return new Inner();
    }
    public static Inner getStaticInner(){
        return new Inner();
    }
}
