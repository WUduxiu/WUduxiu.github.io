package _04面向对象编程;

import java.util.Scanner;

public class _01类与对象 {

	public static void main(String[] args) {
		/*
		 * 单独使用变量缺点
		 * 需要定义的变量名太多不便于管理
		 * 单独使用数组的缺点
		 * 不能更好的对应信息类型
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入小猫的名字");
		String name = scanner.next();
		int age1 = 3;
		int age2 = 100;
		String color1 = "白色";
		String color2 = "花色";
		switch(name){
		case  "小白" :
			System.out.println("小猫的名字为"+name);
			System.out.println("小猫的年龄为"+age1+"岁");
			System.out.println("小猫的颜色"+color1);
			break;
		case "小花" :
			System.out.println("小猫的名字为"+name);
			System.out.println("小猫的年龄为"+age2+"岁");
			System.out.println("小猫的颜色"+color2);
			break;
		default :
			System.out.println("张老太没有这只猫");
		}
		

	}

}
