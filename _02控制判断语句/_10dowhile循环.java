package _02�����ж����;

import java.util.Scanner;

public class _10dowhileѭ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;//ѭ��������ʼ��
		do {
			System.out.println("dowhileѭ��"+i);//ѭ��ִ�����
			i++;//ѭ����������
		}while(i<=10);
		System.out.println("�˳���dowhile"+i);
		//---------------------------------------------------
		int n=1;
		int count=0;
		int sum=0;
		do {

			if(n%5==0&&n%3!=0) {
				System.out.println(n);
				sum=sum+n;
				count++;
			}
				n++;
			
			
		}while(n<=200);
		System.out.println("1-100��Ϊ"+sum);
		System.out.println("����Ϊ"+count);
		//------------------------
		Scanner scanner = new Scanner(System.in);
		char answer;
		do {
			System.out.println("!");
			System.out.println("��Ǯ��y/n");
			 answer = scanner.next().charAt(0);
			System.out.println("�ش���"+answer);

			
		}while(answer!='y');
		System.out.println("��Ǯ��");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
