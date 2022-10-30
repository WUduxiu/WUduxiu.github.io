package com.study.HomeWork;

public class Test15 {
        //什么是多态，多态具体体现有哪些？
        /*
        多态：方法或者对象具有多种形态，是OOP的第三大特征，是建立在封装和继承基础之上
        多态具体体现
        1.方法的多态  (1)方法的重载   (2)方法的重写
        2.对象多态
        (1)对象的编译类型和运行类型可以不一致，编译类型在定义时就已经确定，不能再变化
        (2)对象的运行类型是可以变化的，可以通过getClass()方法来查看对象的运行类型
        (3)编译类型看 = 的左边    运行类型看 = 的右边
         */
        public static void main(String[] args) {
            AA obj = new BB();//此时obj的运行类型为BB
            System.out.println("obj的运行类型为"+obj.getClass());
            obj = new CC();//此时obj的运行类型为CC
            System.out.println("obj的运行类型为"+obj.getClass());
            AA obj1 = new BB();
            obj = obj1;//此时obj的运行类型又变成了BB
            System.out.println("obj的运行类型为"+obj.getClass());
            //编译类型就一直是AA   运行类型在不断变化
        }
}
class AA{

}
class BB extends AA{

}
class CC extends BB{

}
