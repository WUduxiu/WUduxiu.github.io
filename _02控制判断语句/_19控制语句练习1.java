package _02�����ж����;

import java.util.Scanner;

public class _19���������ϰ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double money =100000;
		int i =0;
		while(true) {
			if(money>50000) {
				money = money-(money*0.05);
				i++;
			}else if(money>=1000) {
				money = money-1000;
				i++;
			}else {
				
				break;
			}

		}
		System.out.println("������"+i+"��·��");
		int a,b,c,n;//aΪ������bΪʮλ����cΪ��λ����nΪ����ɵ�����
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ�жϵ����ĸ�λ");
		a = scanner.nextInt();
		System.out.println("������Ҫ�жϵ�����ʮλ");
		b = scanner.nextInt();
		System.out.println("������Ҫ�жϵ����İ�λ");
		c = scanner.nextInt();
		System.out.println("���Եõ�����λ��Ϊ"+(a+10*b+100*c));
		if((a*a*a)+(b*b*b)+(c*c*c)==(a+10*b+100*c)) {
			System.out.println("����Ϊˮ�ɻ���");
		}else {
			System.out.println("��������ˮ�ɻ���");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
