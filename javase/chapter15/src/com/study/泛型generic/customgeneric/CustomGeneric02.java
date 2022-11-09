package com.study.泛型generic.customgeneric;

/**
 * @date 2022/10/16&23:04
 */
public class CustomGeneric02 {
}
/*
接口泛型
1.静态成员不能使用泛型
2.在继承接口或者是实现接口时 指定泛型接口的类型
3.没有指定的泛型 默认的泛型是Object
 */
interface I<U,R>{
   public final static int n = 10; //接口中 属性是 public final static
    //U s;  带有static 不能使用泛型
    //n = 20;  只能初始化一次
    //普通方法中，可以使用接口泛型
    //接口里面的抽象方法
    R get(U u);  // String get(Integer integer) 返回类型 方法名 (形参类型 形参名)
    void hi(R r);
    void run(R r1,R r2,U u1,U u2);
    //在jdk8 中，可以在接口中，使用默认方法，也是可以使用泛型
}
interface Ia extends I<String,Double>{ }
class A implements Ia{//当实现Ia接口时，因为Ia继承了I 并且指定了泛型类型<String,Double>

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}
class B implements I<Integer,Float>{
    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}
class C implements I<Object,Object>{

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}
