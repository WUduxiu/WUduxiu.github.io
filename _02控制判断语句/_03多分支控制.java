package _02控制判断语句;

import java.util.Scanner;

public class _03多分支控制 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入芝麻信用分");
		int i = scanner.nextInt();
		if (i>=1&&i<=100){
		if(i==100) {
			System.out.println("信用极好");
		}else if(80<i&i<=99) {
			System.out.println("信用优秀");
		}else if(60<=i&i<=80) {
			System.out.println("信用一般");
		}else {
			System.out.println("信用不及格");
		}
	}else {
		System.out.println("请输入正确的信用分数");
	}
		//----------------------
		boolean b1 = true;
		if(b1==false)
			System.out.println("a");//此时为F  不执行
		else if(b1)
			System.out.println("b");//此时为T  执行
		else if(!b1)
			System.out.println("c");
		else
			System.out.println("d");
		//-------------------------
		boolean b2 = true;
		if(b2=false)
			System.out.println("a");//此时为F  不执行
		else if(b2)
			System.out.println("b");//此时为F  执行
		else if(!b2)
			System.out.println("c");//此时为T  执行
		else
			System.out.println("d");
		
		
}	 
}