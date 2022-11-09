package com.study.HomeWork;

public class Test06 {

}
class Grand{
    String name = "AA";
    private int age = 100;
    private void g1(){

    }
}
class Father extends Grand{
    //super可以访问哪些成员（属性和方法） name="AA"
    //this可以访问哪些  id="001"  double score f1()  name="AA"
    String id = "001";
    private double score;
    public void f1(){

    }
}
class Son extends Father{
    //super可以访问哪些成员（属性和方法） id="001" f1() name="AA"
    //this可以访问哪些 name="BB" g1() show() f1() id="001"
    String name = "BB";
    public void g1(){

    }
    private void show(){

    }
}
