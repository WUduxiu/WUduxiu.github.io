package _02控制判断语句;

import java.util.Scanner;

public class _01ifelse的快速入门 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的年龄");
		int age = scanner.nextInt();
		System.out.println("你的年龄为"+age);
		if(age>18) {
			System.out.println("年龄大于18");
		}else {
			age++;
			System.out.println(age);
		}
		System.out.println("那没事了");
	}

}
