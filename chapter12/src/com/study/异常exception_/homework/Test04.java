package com.study.异常exception_.homework;

/**
 * @date 2022/10/9&22:53
 */
public class Test04 {
    public static void main(String[] args) throws Exception {
        showExce();//调用者就要处理这个异常
        try {
            showExce();
            System.out.println("A");
        }catch (Exception e){
            System.out.println("B");
        }finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void showExce() throws Exception {
        throw new Exception();//因为Exception()这个异常可能是编译异常
    }
}
