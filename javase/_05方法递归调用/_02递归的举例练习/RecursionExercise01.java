package _05方法递归调用._02递归的举例练习;

import java.util.Scanner;

public class RecursionExercise01 {
    public static void main(String[] args) {
        A a = new A();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数n的值");
        int n = scanner.nextInt();
        int res =  a.method(n);
        if (n>=1){
            System.out.println("当n="+n+"时斐波拉契书为"+res);
        }

    }
}
class A{
    /*
        当 n=1时，斐波拉契数为1
        当 n=2时，斐波拉契为1
        当 n=3时，斐波拉契为前一个数加后一个数
        4,  1+1+1
        5,  1+1 +1+1+1
        6,  1+1+1+ 1+1+1+1+1
     */
    public int method(int n){
        if (n>=1){
            if (n==1||n==2){
                return 1;
            }else {
                return method(n-1)+method(n-2);
            }
        }else {
            System.out.println("你输入的值有误：n>=1");
            return -1;
        }

    }
}
