package _02�����ж����;

import java.util.Scanner;

public class _05Ƕ�׷�֧��ӡƱ����ϰ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("�������·�");
		int mouth = scanner1.nextInt();
		if(1<=mouth&&mouth<=12){
			if(4<=mouth&&mouth<=10) {
				System.out.println("��ʱΪ����");
				System.out.println("\n");
				Scanner scanner2 = new Scanner(System.in);
				System.out.println("����������");
				int age = scanner2.nextInt();
				if(0<age&&age<=110) {
					if(18<=age&&age<=60) {
						System.out.println("Ʊ��Ϊ60Ԫ");
					}else if(0<age&&age<18){
						System.out.println("Ʊ��Ϊ30Ԫ");
					}else if(age>60) {
						System.out.println("Ʊ��Ϊ20Ԫ");
					}
				}else {
					System.out.println("��������ȷ������");
				}
			}else {
				System.out.println("��ʱΪ����");
				System.out.println("\n");
				Scanner scanner2 = new Scanner(System.in);
				System.out.println("����������");
				int age = scanner2.nextInt();
				if(0<age&&age<=110) {
					if(18<=age&&age<=60) {
						System.out.println("Ʊ��Ϊ40Ԫ");
					}else {
						System.out.println("Ʊ��Ϊ20Ԫ");
					}
				}else {
					System.out.println("��������ȷ������");
				}
			}
		}else {
			System.out.println("��������ȷ���·�");
		}
		
	}	

}
