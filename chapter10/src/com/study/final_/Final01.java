package com.study.final_;

public class Final01 {
    public static void main(String[] args) {
        D d = new D();
        System.out.println(d.b);
        d.setB();
    }
}
//父类不希望被继承可以用final修饰
final class A{ }
//class B extends A{ }
class C{
    public final int a = 10;
    public int b = 20;//不希望某个类的属性被修改时，可以加final关键字
    public final void hi(){}//加了final关键字 子类继承父类无法重写该方法
    public void hello(){}
}
class D extends C{
    @Override
    public void hello() {
        super.hello();
    }
    public void setB(){
        this.b = 100;
        System.out.println(b);
    }
}
class F{
    public void cry(){
      final double NUM = 10.0;
       // NUM = 20.0;  当不希望某个局部变量改变时，用final修饰 像这种无法修改的值一般大写
    }
}

