package com.study.extend_继承;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.setScore(60);
        pupil.name = "小学生";
        pupil.age = 10;
        pupil.show();
        Graduate graduate = new Graduate();
        graduate.setScore(80);
        graduate.age = 20;
        graduate.name = "大学生";
        graduate.show();
    }
}
