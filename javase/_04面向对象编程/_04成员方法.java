package _04面向对象编程;

import java.util.Scanner;

public class _04成员方法 {
    public static void main(String[] args) {
        person1 p = new person1();
        p.speak();
        p.cal01();
        p.cal02(10);
        p.getSum(10,20);
     int returnres =    p.addsum(10,20);
        System.out.println("addSum返回的值为"+returnres);
    }
}
    class person1{
    //成员属性
        String name;
        int age;
    //方法
        public void speak(){
            System.out.println("我是一个好人");
        }
        public void cal01(){
            int sum = 0;
            for(int i=1;i<=100;i++){
                sum = sum+i;
            }
            System.out.println("1+到100的结果为"+sum);
        }
        public void cal02(int n){//(int n):形参列表，表示当前有一个形参 n，可以接收用户输入。
            // Scanner scanner = new Scanner(System.in);
            // System.out.println("请输入n的值");
            // n = scanner.nextInt();
            int sum = 0;
            for(int i=1;i<=n;i++){
                sum = sum+i;
        }
            System.out.println("1+到"+n+"的值为"+sum);
        }
        public void getSum(int a,int b){
            int sum = 0;
            sum = a+b;
            System.out.println(a+"+"+b+"="+sum);
        }
        public int addsum(int number1,int number2){
            //1.public 表示方法是公开的
            //2.int    表示方法执行后，会返回一个int类型的值
            //3.addSum 表示方法名
            //4.(int number1,int number2) 形参列表有俩个形参 可以接收俩个参数
            //5.返回res的值
            int res = number1+number2;
            return res;

        }

    }
