package _02�����ж����;


import java.util.Scanner;

public class _06Switch��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ַ�");
		int i = scanner.nextInt();
		if(i>5) {
			System.out.println("�������ַ�");
			int i1 = scanner.nextInt();
			switch(i1) {
			case 1:
				System.out.println("����������һ");
			
			case 2:
				System.out.println("���������ڶ�");
			
			case 3:
				System.out.println("������������");
			
			case 4:
				System.out.println("������������");
			default :
				System.out.println("����ֹͣ");
				
			
			
			}
		
		
				
		}else {
			System.out.println("�������ֵ̫С��");
		}

	}

}
