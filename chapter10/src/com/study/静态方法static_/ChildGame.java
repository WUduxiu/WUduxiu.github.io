package com.study.静态方法static_;

public class ChildGame {
    public static void main(String[] args) {
        //int count = 0;
        Child child1 = new Child("jack");
        child1.join();
        child1.count++;
        Child child2 = new Child("lucy");
        child2.join();
        child2.count++;
        System.out.println("总共有"+Child.count+"个小孩加入游戏");
        System.out.println("child1.count="+child1.count);
        System.out.println("child2.count="+child2.count);

    }

}
class Child{
    private String name;
    public static int count;//static静态属性 Chlid类的所有对象实例共享
    //jdk7
    public Child(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println("小孩"+name+"加入了游戏");
    }
}
