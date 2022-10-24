package _02控制判断语句;

import java.util.Scanner;

public class _05嵌套分支打印票价练习 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("请输入月份");
		int mouth = scanner1.nextInt();
		if(1<=mouth&&mouth<=12){
			if(4<=mouth&&mouth<=10) {
				System.out.println("此时为旺季");
				System.out.println("\n");
				Scanner scanner2 = new Scanner(System.in);
				System.out.println("请输入年龄");
				int age = scanner2.nextInt();
				if(0<age&&age<=110) {
					if(18<=age&&age<=60) {
						System.out.println("票价为60元");
					}else if(0<age&&age<18){
						System.out.println("票价为30元");
					}else if(age>60) {
						System.out.println("票价为20元");
					}
				}else {
					System.out.println("请输入正确的年龄");
				}
			}else {
				System.out.println("此时为淡季");
				System.out.println("\n");
				Scanner scanner2 = new Scanner(System.in);
				System.out.println("请输入年龄");
				int age = scanner2.nextInt();
				if(0<age&&age<=110) {
					if(18<=age&&age<=60) {
						System.out.println("票价为40元");
					}else {
						System.out.println("票价为20元");
					}
				}else {
					System.out.println("请输入正确的年龄");
				}
			}
		}else {
			System.out.println("请输入正确的月份");
		}
		
	}	

}
