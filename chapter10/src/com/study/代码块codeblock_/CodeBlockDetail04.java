package com.study.代码块codeblock_;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        //new N();
        /*
        因为N extends M
        其中构造器省略了俩行代码
        public M(){
            super();
            调用M类中的普通代码块
        }
        public N(){
            super();
            调用N类中的普通代码块
        }
        所以当M N俩个类的静态成员调用完了以后，就优先完成父类的创建
        属性初始化和代码块优先级一样，看定义顺序来决定调用顺序
        完成父类的普通属性初始化和普通代码块再完成父类的构造器构建
        最后再完成子类的普通属性初始化和普通代码块再完成字类的构造器构建
         */
            new X();

    }
}
class M{
    public M(){
        System.out.println("7 M的无参构造器被调用");
    }
    public int n2 = getN2();
    {
        System.out.println("6 M类的普通代码块被调用");
    }
    public static int n1 =getN1();
    static {
        System.out.println("2 M类的静态代码块被调用");
    }
    public static int getN1(){
        System.out.println("1 静态属性初始化");
        return 10;
    }
    public int getN2(){
        System.out.println("5 M类的普通属性初始化");
        return 10;
    }

}
class N extends M{
    public N(){
        System.out.println("10 N类的无参构造器被调用");
    }
    static {
        System.out.println("3 N类的静态代码块被调用");
    }
    {
        System.out.println("8 N类的普通代码块被调用");
    }
    public static int n3 = getN3();
    public int n4 = getN4();
    public static int getN3(){
        System.out.println("4 N类的静态属性初始化");
        return 20;
    }
    public int getN4(){
        System.out.println("9 N类的普通属性初始化");
        return 20;
    }
}
class X{
    private static int a = 10;
    private int b = 20;
    static {
        N.getN1();
        System.out.println(N.n1);
        //System.out.println(N.n2);  静态代码块通过类名.的方式只能引用静态成员
        N n = new N();
        n.getN2();
        n.getN1();
        System.out.println(X.a);
        //System.out.println(b);  在同一个类中 静态代码块中只能调用静态成员
    }
    {
        X x = new X();
        //在同一个类中 普通代码块可以调用静态成员和普通成员
        System.out.println(x.a);
        System.out.println(x.b);
    }
}
