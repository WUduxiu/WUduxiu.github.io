package com.study.类详解object_;

public class HashCode {
    public static void main(String[] args) {
        AA a = new AA();
        AA b = new AA();
        AA c = a;
        System.out.println("a的hashcode值"+a.hashCode());
        System.out.println("b的hashcode值"+b.hashCode());
        System.out.println("c的hashcode值"+c.hashCode());
    }
}
class AA{

}
