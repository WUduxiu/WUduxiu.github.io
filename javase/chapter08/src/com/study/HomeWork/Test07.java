package com.study.HomeWork;

public class Test07 {
}
class Test{
    String name = "Rose";
    Test(){
        System.out.println("Test");
    }
    Test(String name){
        this.name = name;
        System.out.println(name);
    }
}
class Demo extends Test{
    String name = "jack";
    Demo(){
        super();
        System.out.println("Demo");
    }
    Demo(String s){
        super("123");
        this.name =s;
    }
    public void test(){
        System.out.println(super.name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        new Demo().test();//Test Demo Rose jack
        new Demo("john").test();//123  123  john
    }
}
