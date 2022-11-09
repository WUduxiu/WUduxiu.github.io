package com.study.接口interface_.接口多态InterfacePoly;

public class 接口多态传递InterfacePolyPass {
    public static void main(String[] args) {
        IA c = new C();
        c.hi();
    }

}
interface IA{
    void hi();
    void hello();
}
interface IB extends IA{}
class C implements IB{//C类只是单实现了IB接口并没有实现IA接口，
                    // 但是IB接口继承了IA接口，也相当于C类实现了IA接口，也要实现IA接口中的抽象方法
    @Override
    public void hi() {
        System.out.println("实现了IA接口中的hi()方法");
    }

    @Override
    public void hello() {

    }
}
