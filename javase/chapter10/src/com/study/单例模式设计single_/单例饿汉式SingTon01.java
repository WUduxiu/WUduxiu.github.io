package com.study.单例模式设计single_;

public class 单例饿汉式SingTon01 {
    public static void main(String[] args) {
        //GirlFriend girlFriend = new GirlFriend("123");
        GirlFriend girlFriend = GirlFriend.getInstance();//该返回值是一个对象
        GirlFriend girlFriend1 = GirlFriend.getInstance();
        System.out.println(girlFriend1);
        System.out.println(girlFriend);
        System.out.println(girlFriend1==girlFriend);//T
        System.out.println(GirlFriend.n);
    }
}
class GirlFriend{
    //[单例模式-饿汉式]  创建了可能未使用实例对象 可能会造成资源的浪费
    //为什么叫饿汉式？ 类的实例还未使用前，该类的内部就已经创建好了一个实例
    /*
    如何保障我们只能创建一个GirlFriend 对象
    1.构造器私有化 防止在别的类里面可以直接new实例创建
    2.在类的内部直接创建一个对象
    3.用一个公共的static方法，返回在类内部创建的实例对象
     */
    private String name;
    public static int n = 100;

    private GirlFriend(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }
    //static静态方法只会初始化创建一次
    private static GirlFriend gf = new GirlFriend("lucy");
    public static GirlFriend  getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
