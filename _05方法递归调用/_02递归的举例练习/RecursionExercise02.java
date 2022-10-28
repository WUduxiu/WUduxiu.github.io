package _05方法递归调用._02递归的举例练习;

import java.util.Scanner;

public class RecursionExercise02 {
    public static void main(String[] args) {
        B b = new B();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入天数");
        int day = scanner.nextInt();
        int res =  b.monkey(day);
        if (res>0){
            System.out.println(res);
        }

    }
}
class B{
    /*
    1- n
    2- n/2 -1
    3 (n/2 -1)/2
    10-1 9-4 8-10 7-22 6-46 5-94 4-
    9-(day10+1)2
     */
    public int monkey(int day){
        if (1<=day&&day>=10){
        }
        if (day==10){
            return 1;
        }else if(day>=1&&day<=9){//前一天桃子数=（后一天桃子树+1）*2
            int peach = (monkey(day+1)+1)*2;
            return peach;
        }
        System.out.println("输入的天数有误，请输入1-10天");
        return -1 ;
    }
}
