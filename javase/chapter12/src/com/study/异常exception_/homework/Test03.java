package com.study.异常exception_.homework;

/**
 * @date 2022/10/9&22:48
 */
public class Test03 {
    public static void func(){
        try {
            throw new RuntimeException();
        }finally {
            System.out.println("1B");
        }
    }

    public static void main(String[] args) {
        try {
            func();
            System.out.println("A");//调用方法会抛出异常是，所以这句语句不会执行
        }catch (Exception e){
            System.out.println("2C");
        }
        System.out.println("3D");
    }
}
