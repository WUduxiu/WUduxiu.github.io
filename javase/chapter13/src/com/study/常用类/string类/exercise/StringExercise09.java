package com.study.常用类.string类.exercise;

/**
 * @date 2022/10/10&20:54
 */
public class StringExercise09 {
        String str = new String("hsp");
        final char[] ch = {'j','a','v','a'};
        public void change(String str,char ch[]){
            str = "java";
            ch[0] = 'h';
        }

    public static void main(String[] args) {
        StringExercise09 ex = new StringExercise09();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+"and");//hspand
        System.out.println(ex.ch);//hava
    }



}
