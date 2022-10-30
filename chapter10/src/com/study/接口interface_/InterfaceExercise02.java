package com.study.接口interface_;

public class InterfaceExercise02 {
    public static void main(String[] args) {
        new CC().pX();
    }
}
interface AA{
    int x = 0;//public static final x = 0
}
class BB{
    int x = 1;
}
class CC extends BB implements AA{
    public void pX(){
        System.out.println(AA.x);
        System.out.println(super.x);
    }
}
