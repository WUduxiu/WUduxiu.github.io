package _02�����ж����;

import java.util.Scanner;

public class _11����ѭ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("i="+i+"j="+j);
			}
		}
	
		Scanner scanner = new Scanner(System.in);
		double all =0;
		int c=0;
		for(int b=1;b<=3;b++) {
			double sum = 0;
			for(int a=1;a<=5;a++) {
				System.out.println("������"+b+"���"+a+"��ѧ���ĳɼ�");
				double score = scanner.nextDouble();
				if(score>60.0) {
					c++;
				}
				System.out.println("��"+b+"���"+a+"��ѧ���ĳɼ�Ϊ"+score);
				sum=sum+score;				
			}
				all=all+sum;
			System.out.println(b+"���ܳɼ�Ϊ"+sum+"\n"+b+"��ƽ����Ϊ"+sum/5);				
		}
		System.out.println("���а���ܳɼ�Ϊ"+all+"����ѧ����ƽ����Ϊ"+(all/15));
		System.out.println("�����༸������Ϊ"+c);
}
}
