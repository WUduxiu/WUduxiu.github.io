package com.study.异常exception_.自定义异常customexercise;

/**
 * @date 2022/10/9&22:03
 */
public class ThrowException {
    static void methodA(){
        try {
            System.out.println("1进入方法A");
            throw new RuntimeException("3制造异常");
        }finally {
            System.out.println("2用A方法的finally");
        }
    }
    static void methodB(){
        try {
            System.out.println("4进入方法B");
            return;
        }finally {//无论如何都输出，输出完了再return
            System.out.println("5调用B方法的finally");
        }
    }

    public static void main(String[] args) {
        try {
            ThrowException.methodA();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        ThrowException.methodB();
    }
}
