package com.study.homework;

/**
 * @date 2022/10/8&10:31
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock1 = new Frock();
        System.out.println(frock1.getNumber());
        Frock frock2 = new Frock();
        System.out.println(frock2.getNumber());
        Frock frock3 = new Frock();
        System.out.println(frock3.getNumber());
    }
}
class Frock{
    private int Number;
    private static int currentNum = 100000;
    public static int getNextNum(){
        currentNum+=100;
        return currentNum;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public Frock() {
        Number = getNextNum();
    }
}

