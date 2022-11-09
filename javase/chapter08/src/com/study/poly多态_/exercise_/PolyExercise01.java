package com.study.poly多态_.exercise_;

public class PolyExercise01 {
    public static void main(String[] args) {
        double d = 13.4;
        long l = (long) d;//向下转型
        System.out.println(l);//13

        int in = 5;
       // boolean b = (boolean) in; int 无法转换为 boolean类型
        Object obj = "Hello";//向上转型
        String objStr = (String) obj;//向下转型
        System.out.println(objStr);//Hello

        Object objPri = new Integer(5);
        //String str = (String) objPri;  (String) objPri此时是Integer类型
        Integer str1 = (Integer) objPri;
        System.out.println(str1);//5
    }
}
