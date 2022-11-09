package com.study.modifier修饰符;

public class A {
    public int n1 = 100;
    protected  int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public static void main(String[] args) {
        A a = new A();
        a.n4 = 100;
        //四种方法全都可以访问到  public protected 默认修饰符 private
        a.m1();
        a.m2();
        a.m3();
        a.m4();
    }

    public void m1(){
        //同类下可以访问 public protected 默认 private 修饰符
        System.out.println(n1+" "+n2+" "+n3+" "+n4);
    }
    protected void m2(){

    }
    void m3(){//默认修饰符

    }
    private void m4(){

    }
}
class c{
    //只有public 和 默认修饰符能修饰类
    public void test(){

    }
}
