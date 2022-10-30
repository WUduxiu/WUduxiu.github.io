package com.study.内部类innerclass.匿名内部类anonymousinnerclass.exercise;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            /*
            传递的类型相当于
            编译类型是Bell接口类型
            运行类型是匿名内部类
            Bell bell = new Bell(){
                    @Override
            public void ring() {
                System.out.println("起床了");
            }
            };
             */
            @Override
            public void ring() {
                System.out.println("起床了");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床了123");
            }
        });
    }

}
interface Bell{
    void ring();
}
class CellPhone{
    public void alarmClock(Bell bell){
        bell.ring();//动态绑定
        System.out.println(bell.getClass());//匿名内部类的运行类型
    }
}
