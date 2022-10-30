package com.study.内部类innerclass.静态内部类staticinnerclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        //相当于三个对象
        Test t = new Test();
        Test.Inner r = t.new Inner();
        System.out.println(r.a);
    }
}

class Test{
    public Test() {
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        System.out.println(s2.a);//5

    }
    class  Inner{
        public int a = 5;

    }
}
