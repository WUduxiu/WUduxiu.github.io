package _02�����ж����;

import java.util.Scanner;

public class _07Switch��֧�ṹ��ϰ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("������Ҫת�����ַ���ֻ��a-e��");
		char c = scanner1.next().charAt(0);
		switch(c){
			case 'a' :
				System.out.println("A");
			break;
			case 'b' :
				System.out.println("B");
			break;
			case 'c' :
				System.out.println("C");
			break;
			default :
				System.out.println("other");
		}
		//------------------------------------------
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("������ɼ�");
		/*����double����һ���ɼ�
		 * ��������ɼ�/60����Ϊ�ɼ����ܴ���100�����Եõ������Ҫô����1 ҪôС��1
		 * �ٽ�����intǿת �õ� 0��1 ����ֵ
		 * �õ�0����С��60��  ���ϸ�
		 * �õ�1���Ǵ���60��   �ϸ�
		 * 
		 */
		double score = scanner2.nextDouble();
		int n = (int)(score/60);
		if(0<=score&&score<=100) {
			switch(n) {
			case 1 :
				System.out.println("�ϸ�");
			break;
			case 0 :
				System.out.println("���ϸ�");
			break;			
	}
		}else {
			System.out.println("����ĳɼ�����");
		}
		
		//----------------------
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("�������·�");
		int mouth = scanner3.nextInt();
		//ʹ�ô�͸�����
		switch(mouth){
			case 3 :				
			case 4 :				
			case 5 :
				System.out.println("����");
			break;
			case 6 :				
			case 7 :				
			case 8 :
				System.out.println("�ļ�");
			break;
			case 9 :				
			case 10 :				
			case 11 :
				System.out.println("�＾");
			break;
			case 12 :				
			case 1 :				
			case 2 :
				System.out.println("����");
			break;
			default :
				System.out.println("��������·�������");
		}
		
	}

}
