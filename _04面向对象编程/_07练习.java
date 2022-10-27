package _04面向对象编程;

import java.util.Scanner;

public class _07练习 {
    public static void main(String[] args) {
        AA a = new AA();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要判断的值");
        int n = scanner.nextInt();
        boolean result =   a.method(n);
        if (result){
            System.out.println(n+"为偶数");
        }else{
            System.out.println(n+"为奇数");
        }
        System.out.println("-----------");
        System.out.println("请输入需要打印的行数");
        int x = scanner.nextInt();
        System.out.println("请输入需要打印的列数");
        int y = scanner.nextInt();
        System.out.println("请输入需要打印的字符");
        char c = '.';
        a.print(x,y,c);
    }
}
    //1.方法返回的类型 boolean
    //2.方法的名字
    //3.方法的形参（int n）
    //4.方法体
    class AA{
        public boolean method(int n){
           return n % 2 ==0 ? true:false;
        }
        public void print(int x,int y,char c){
            for(int i=0;i< x;i++){
                for (int n=0;n<y;n++){
                    System.out.print(c+"\t");
                }
                System.out.println("");
            }

        }
    }
