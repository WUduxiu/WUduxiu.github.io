package com.study.final_.exercise;

public class FinalExercise02 {
    public int addOne(final int x){//允许形参用final修饰
       //++x; 相当于是 x = x+1; 先赋值后自增
        return x+1;//这里并没有对x赋值只是进行了运算
    }
}

