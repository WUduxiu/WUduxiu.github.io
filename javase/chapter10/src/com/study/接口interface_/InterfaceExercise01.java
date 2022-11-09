package com.study.接口interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        System.out.println(b.a);
        System.out.println(A.a);//23
        System.out.println(B.a);
        System.out.println(c.a);
    }
}
interface A{
    public static final int a = 23;
}
class B implements A{}//看作特殊的继承
class C implements A{}

