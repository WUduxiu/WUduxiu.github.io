package _01�����������ͼ������;

public class _02������������ {
	public static void main(String[]args) {
		/*��������ת��Ĭ�ϴ�Сֵת������ֵ
		 * 
		 * char-int-long-float-double
		 * byte-short-int-long-float-double
		 * ������''������char����
		 * ˫����""�������ַ�ת String
		 * char short byte���������Ͳ��ܻ����Զ�ת��
		 * char short byte�������Ͳ������  ����ת��Ϊint����
		 * byte b1 =1;
		 * byte b2=1;
		 * byte = b1+b2;������Ϊ b1+b2�Ѿ���ת����int���� int���Ͳ���ת�ɳ�byte����
		 * 
		 * 
		 */		
		int num = 'a';
		//a��char���� char����ת��int
		double b =80;
		String name ="����";
		//80��int�� ����ת���� double
		System.out.println(num);
		System.out.println(b);
		System.out.println("������"+name);
		System.out.println("----------");
		int a1 =1;
		float c = 1+1.1f;
		byte n1 =10;
		//char n2 =n1; ��ʱ���n1�Ѿ���byte���� byte��char���Ͳ����Զ�����ת��
		System.out.println(c);
		System.out.println(n1);
		System.out.println("---------");
		int t =(int)(1.1+1.8);
		System.out.println(t);
		System.out.println("--------");
		char h =100;
		System.out.println(h);
		
	}
}
