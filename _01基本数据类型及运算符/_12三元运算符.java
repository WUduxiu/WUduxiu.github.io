package _01�����������ͼ������;

public class _12��Ԫ����� {

	public static void main(String[] args) {
		// 
		int a = 10;
		int b = 100;
		int result = a>b ? a++ : b--;//������Ϊ����ִ�е�һ��  Ϊ��ִ�еڶ�����һ���ʦ��
		System.out.println("result="+result);//100 ��Ϊb--���ȸ�ֵ���Լ�
		//���Ի��Ƚ� b=100����result 
		System.out.println("a="+a);//10
		System.out.println("b="+b);//99
		System.out.println("--------");
		int x =7;
		int y = 6;
		int c =x>y ? 10 : 11 ;
		System.out.println("x="+x+"y="+y);
		System.out.println("c="+c);
		System.out.println("-------------");
		int n1 = 55;
		int n2 = 44;
		int n3 = 41;
		int t1 = n1>n2 ? n1 : n2;
		int t2 = t1>n3 ? t1 : n3;
		System.out.println("���ֵΪ"+t2);
		int q =10;
		int p =5;
		if(2<1) {
			 q++;
		}else {
			p++;
		}
		System.out.println("q="+q+"\n"+"p="+p);
		
		
		
		
		
	}

}
