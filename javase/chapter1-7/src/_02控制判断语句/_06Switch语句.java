package _02控制判断语句;


import java.util.Scanner;

public class _06Switch语句 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入字符");
		int i = scanner.nextInt();
		if(i>5) {
			System.out.println("请输入字符");
			int i1 = scanner.nextInt();
			switch(i1) {
			case 1:
				System.out.println("今天是星期一");
			
			case 2:
				System.out.println("今天是星期二");
			
			case 3:
				System.out.println("今天是星期三");
			
			case 4:
				System.out.println("今天是星期四");
			default :
				System.out.println("程序停止");
				
			
			
			}
		
		
				
		}else {
			System.out.println("你输入的值太小了");
		}

	}

}
