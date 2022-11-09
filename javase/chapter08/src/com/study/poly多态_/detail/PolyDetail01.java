package com.study.poly多态_.detail;

public class PolyDetail01 {
    public static void main(String[] args) {
       Base base = new Sub();
       //此时编译类型是Base， 运行类型是Sub
        //但是属性直接看编译类型和方法的调用不同
        System.out.println(base.count);//20
        Sub sub = new Sub();
        System.out.println(sub.count);//10
    }
}
class Base{
    int count = 20;
}
class Sub extends Base{
    int count = 10;
}
