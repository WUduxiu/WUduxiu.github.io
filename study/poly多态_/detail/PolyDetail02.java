package com.study.poly多态_.detail;

public class PolyDetail02 {
    public static void main(String[] args) {
        //instanceOf比较操作符，用于判断对象的运行类型是否为xx类型或其子类类型
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);
        Object object = new Object();//此时运行类型为 object  编译类型也为 object
        String string = "hello";//运行类型为String
        System.out.println(string instanceof Object);//因为string是object的子类

    }
}
class AA{

}
class BB extends AA{

}
