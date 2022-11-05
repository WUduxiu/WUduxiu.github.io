package com.study.泛型generic.customgeneric;

/**
 * @date 2022/10/16&22:51
 */
public class CustomGenericExercise01 {
    public static void main(String[] args) {
        MyGeneric<Double, String, Integer> g = new MyGeneric("jhon");
        g.setD(109.1);
        //g.setD(""); 类型不对
        System.out.println(g);
        MyGeneric g2 = new MyGeneric("john");//默认前面三个泛型都是Object
        g2.setD("123");//此时的D是Object
    }
}
class MyGeneric<D,S,I>{
    D d;
    S s;
    I i;

    public MyGeneric(D d, S s, I i) {
        this.d = d;
        this.s = s;
        this.i = i;
    }

    public MyGeneric(S jhon) {

    }

    public D getD() {
        return d;
    }

    public void setD(D d) {
        this.d = d;
    }

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public I getI() {
        return i;
    }

    public void setI(I i) {
        this.i = i;
    }
}
