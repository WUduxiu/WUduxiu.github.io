package _02�����ж����;

import java.util.Scanner;

public class _03���֧���� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������֥�����÷�");
		int i = scanner.nextInt();
		if (i>=1&&i<=100){
		if(i==100) {
			System.out.println("���ü���");
		}else if(80<i&i<=99) {
			System.out.println("��������");
		}else if(60<=i&i<=80) {
			System.out.println("����һ��");
		}else {
			System.out.println("���ò�����");
		}
	}else {
		System.out.println("��������ȷ�����÷���");
	}
		//----------------------
		boolean b1 = true;
		if(b1==false)
			System.out.println("a");//��ʱΪF  ��ִ��
		else if(b1)
			System.out.println("b");//��ʱΪT  ִ��
		else if(!b1)
			System.out.println("c");
		else
			System.out.println("d");
		//-------------------------
		boolean b2 = true;
		if(b2=false)
			System.out.println("a");//��ʱΪF  ��ִ��
		else if(b2)
			System.out.println("b");//��ʱΪF  ִ��
		else if(!b2)
			System.out.println("c");//��ʱΪT  ִ��
		else
			System.out.println("d");
		
		
}	 
}