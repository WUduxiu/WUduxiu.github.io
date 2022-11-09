package com.study.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();
        EE ee = new EE();
        ee.car();
    }
}
class AA{
    /*
   final修饰常量的位置：
   1.定义类时
   2.在构造器中
   3.在代码块中
   命名规则大写字母加下划线  XXX_XXX_XXX
    */
    public final double TAX_RATE = 1.0;//final修饰常量必须赋值，不能给默认值
    public final double TAX_RATE2 ;
    public final double TAX_RATE3 ;
    {
        TAX_RATE2 = 2.0;
    }
    public AA(){
        TAX_RATE3 = 3.0;
    }
}
class BB{
    //对静态属性进行修饰时 只能在定义时赋值或者在static代码块中进行赋值
    //因为静态属性要随着类的加载而完成构建  但是构造器是创建对象才会被调用
    public static final double TAX_RATE = 1.0;
    public static final double TAX_RATE2;
    static {
        TAX_RATE2 = 2.0;
    }
}
final class CC{ }//被final修饰的类无法被继承，但是可以实例化对象
class DD{
    public final void car(){
        System.out.println("car()被继承");
    }
}
class EE extends DD{}
