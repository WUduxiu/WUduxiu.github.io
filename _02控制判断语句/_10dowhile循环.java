package _02控制判断语句;

import java.util.Scanner;

public class _10dowhile循环 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;//循环变量初始化
		do {
			System.out.println("dowhile循环"+i);//循环执行语句
			i++;//循环变量迭代
		}while(i<=10);
		System.out.println("退出了dowhile"+i);
		//---------------------------------------------------
		int n=1;
		int count=0;
		int sum=0;
		do {

			if(n%5==0&&n%3!=0) {
				System.out.println(n);
				sum=sum+n;
				count++;
			}
				n++;
			
			
		}while(n<=200);
		System.out.println("1-100合为"+sum);
		System.out.println("个数为"+count);
		//------------------------
		Scanner scanner = new Scanner(System.in);
		char answer;
		do {
			System.out.println("!");
			System.out.println("还钱吗？y/n");
			 answer = scanner.next().charAt(0);
			System.out.println("回答是"+answer);

			
		}while(answer!='y');
		System.out.println("还钱了");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
