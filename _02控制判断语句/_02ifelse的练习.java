package _02�����ж����;

import java.util.Scanner;

public class _02ifelse����ϰ {

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

	System.out.println("�������һ����");
		double i1 = s1.nextDouble();
		System.out.println("������ڶ�����");
		double i2 = s2.nextDouble();
		double i3 = i1+i2;
		if(i1>10.0&i2<20) {
			System.out.println("�������Ϊ"+i3);
			if(i3%3==0) {
				if(i3%5==0) {
					System.out.println("��ֵ�ܱ�3��5����");
				}else {
					System.out.println("��ֵ���ܱ�5����");
				}
		}else {
			System.out.println("��ֵ���ܱ�3����");
	}
		}else {
			System.out.println("�����ֵ����");
		}
		
		//-------------------------------------
		Scanner  Y = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ�����");
		int year = Y.nextInt();
		if(year%400==0|(year%4==0&year%100>0)) {
			System.out.println("����Ϊ����");
		}else {
				System.out.println("���겻������");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
