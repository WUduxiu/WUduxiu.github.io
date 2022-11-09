package com.study.枚举enum_.exercise;

/**
 * @date 2022/10/6&23:42
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        Week[] values = Week.values();
        for (Week weeks : values){
            System.out.println(weeks);
        }
    }
}
enum Week{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),
    THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
    private String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
