package com.study.枚举enum_;

/**
 * @date 2022/10/6&23:51
 */
public class EnumDetail {
    public static void main(String[] args) {
        Detail.PopMusic.playing();
    }
}
enum Detail implements Music{
    PopMusic;
    @Override
    public void playing() {
        System.out.println("播放流行音乐");
    }
    //因为enum关键字已经隐式继承了lang包里面的Enum类，因为java是单继承，所以无法再继承别的类了，
    // 但是可以实现接口,因为它仍然是一个类
}
interface Music{
    void playing();
}

