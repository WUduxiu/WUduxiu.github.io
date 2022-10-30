package com.study.extend_继承.improve;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.setScore(87);
        pupil.name = "小明1";
        pupil.age = 11;
        pupil.show();
        Graduate graduate = new Graduate();
        graduate.setScore(99);
        graduate.name = "大明1";
        graduate.age = 22;
        graduate.show();


    }
}
