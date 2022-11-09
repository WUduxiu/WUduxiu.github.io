package com.study.final_;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(Demo.a);
        System.out.println(Demo.b);
        //包装类包括String是final类 无法被继承
    }
}
final class Test{
    public void test(){}//一般来说用final修饰类 类里面的方法就没必要再用final修饰了
}
//final和static 往往搭配使用，效率更高，不会导致类加载因为底层代码做了优化
class Demo{
    public final static int a =10;
    public static int b = 10;
    static {
        System.out.println("类被加载了");
    }
}
