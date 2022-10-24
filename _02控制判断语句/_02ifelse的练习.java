package _02控制判断语句;

import java.util.Scanner;

public class _02ifelse的练习 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 7;
		int y = 4;
		if(x>5) {
			if(y>5) {
				System.out.println(x+y);
			}
				System.out.println("66666");
		}else 
			System.out.println("x is"+x);
		
		
		//--------------------
	Scanner  s1= new Scanner(System.in);
	Scanner  s2= new Scanner(System.in);
	Scanner  s3= new Scanner(System.in);

	System.out.println("请输入第一个数");
		double i1 = s1.nextDouble();
		System.out.println("请输入第二个数");
		double i2 = s2.nextDouble();
		double i3 = i1+i2;
		if(i1>10.0&i2<20) {
			System.out.println("俩数相加为"+i3);
			if(i3%3==0) {
				if(i3%5==0) {
					System.out.println("该值能被3和5整除");
				}else {
					System.out.println("该值不能被5整除");
				}
		}else {
			System.out.println("该值不能被3整除");
	}
		}else {
			System.out.println("输入的值有误");
		}
		
		//-------------------------------------
		Scanner  Y = new Scanner(System.in);
		System.out.println("请输入要查询的年份");
		int year = Y.nextInt();
		if(year%400==0|(year%4==0&year%100>0)) {
			System.out.println("该年为闰年");
		}else {
				System.out.println("该年不是闰年");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
