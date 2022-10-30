package com.study.poly多态_.detail;

public class PolyDetail {
    public static void main(String[] args) {
        //向上转型:父类的引用指向了子类的对象
        Animal animal = new Cat();
        //可以调用父类中的所有的成员（要遵守修饰符访问规则）
        //但是不能调用子类特有的成员
        //在调用阶段能调用那些成员 由左边的编译类型来决定
        //最终运行结果看左边的具体实现，运行时从运行类型开始查找
        animal.eat();
        animal.run();
        animal.show();
        /*
            多态的向下转型： 子类类型  引用名 = （子类类型） 父类引用名
            只能强转父类的引用，不能强转父类对象
            要求父类的引用必须是指向当前目标类型的成员
         */
        Cat cat = (Cat) animal;
        cat.catchMouse();


    }
}
