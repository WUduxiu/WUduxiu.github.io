package _02�����ж����;

import java.util.Scanner;

public class _16break��ϰ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int n=0;//�ȶ���һ���� ������ȥ�ü����Ľ����ֵ���� ���������
		for(int c=1;c<=100;c++) {
			sum=c+sum;
			if(sum>20) {
				
				System.out.println("�����"+c);
				n=c;
				break;
			}								
			}	
		System.out.println("ѭ����"+n);
		String name ="";
		String password ="";
		int chance=0;
		
		for(int d=1;d<=3;d++) {	
			Scanner scanner = new Scanner(System.in);
			System.out.println("�������û���");
			 name = scanner.next();
			System.out.println("����������");
			 password = scanner.next();
			 /*
			  * �ַ������бȽ�ʹ��equals����
			  * 
			  * 
			  */
			if("С��".equals(name)&&"123456".equals(password)) {

				chance = d;
				break;
			}
				System.out.println("��ʣ"+(3-d)+"�λ���");
			}
			if(chance>0) {
				System.out.println("��½�ɹ�");
			}else {
				System.out.println("��½ʧ��");
			}
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		}
	


