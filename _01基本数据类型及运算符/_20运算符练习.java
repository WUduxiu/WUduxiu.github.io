package _01�����������ͼ������;

public class _20�������ϰ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(10/3);
		System.out.println(10/5);
		System.out.println(10%2);
		System.out.println(-10.5%3);
		//a%b ��aΪС��ʱ����ʽΪ = a-(int)a/b*b
		//-10.5-(int)-10.5/3*3=-10.5-(-10)/3*3=-10.5-(-9)=-1.5
		//��С������ļ���õ��Ľ���ǽ���ֵ
		int i = 66;
		System.out.println(++i+i);//��������ֵ =67+67=134
		int num1 = Integer.parseInt("18");//int num1 = "18";
		//int��תString����Ҫ�ð�װ�ķ��� ��Integer.parseInt("")
		int num2 = (int)18.0; // int num2 = 18.0;
		//18.0Ϊdouble�಻��תΪint��
		double num3 = 3d;//��ȷ
		//3d�൱�� 3double
		double num4 = 8;//��ȷ
		//8Ϊint�����ת��double��
		int c = 48; char ch = (char)+(c+1);//int c = 48; char ch = c+1;
		//c+1��ʱ�Ѿ�Ϊint���� ��Ҫǿת
		byte b =19; short s = (short)(b+2);//byte b =19; short s = b+2;
		//b+2��ʱ�Ѿ�Ϊint���� ��Ҫǿת
		
		
		
		
		
		
		
		
	}

}
