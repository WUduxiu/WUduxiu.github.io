package _02�����ж����;

import java.util.Scanner;

public class _04Ƕ�׷�֧ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("���������");
		double score = scanner1.nextDouble();
		if(score>8.0) {
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("�����Ա�");
			char gender = scanner2.next().charAt(0);
			if(gender=='��') {
				System.out.println("��ϲ����������");
			}else if(gender=='Ů'){
				System.out.println("��ϲ����Ů����");
			}else {
				System.out.println("�����Ա�����");
			}
		}else {
			System.out.println("��̭");
		}
		String a = "123";
		a.toString();
	}

}
