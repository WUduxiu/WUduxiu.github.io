package com.study.内部类innerclass.成员内部类memberinnerclass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
        /*
        外部其他类，调用内部成员类的两种方式
         */
        //1.把new Inner()当作一个成员来看
        Outer.Inner inner = outer.new Inner();
        inner.say();
        //2.在外部类中写一个方法，返回一个Inner()对象
        Outer.Inner inner1 = outer.returnInner();
        inner1.say();
    }
}
class Outer{//外部类
    private int n1 = 10;
    private String name = "外部类";
    public void method(){
        System.out.println("外部类的方法");
    }

    class Inner{//成员内部类：是定义在外部类的成员位置上
        //成员内部类可以添加任何修饰符
        //成员内部类可以访问外部类的任何成员，包括私有成员
        private int n1 = 20;
        private String name = "内部成员类";
        public void say(){
            method();
            System.out.println(name+"的属性: "+n1);
            System.out.println(Outer.this.name+"的属性: "+Outer.this.n1);
        }
    }
    //使用成员内部类
    public void test(){
        Inner inner = new Inner();
        inner.say();
        System.out.println(inner.n1);//使用成员内部类属性
       // System.out.println(Outer.this.n1);
    }
    public Inner returnInner(){
        return new Inner();
    }
}
