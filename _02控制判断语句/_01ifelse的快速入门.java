package _02�����ж����;

import java.util.Scanner;

public class _01ifelse�Ŀ������� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������������");
		int age = scanner.nextInt();
		System.out.println("�������Ϊ"+age);
		if(age>18) {
			System.out.println("�������18");
		}else {
			age++;
			System.out.println(age);
		}
		System.out.println("��û����");
	}

}
