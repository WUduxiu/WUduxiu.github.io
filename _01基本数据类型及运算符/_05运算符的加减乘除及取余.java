package _01�����������ͼ������;



//�Ӽ��˳� ȡ��
//+ - * / %
public class _05������ļӼ��˳���ȡ�� {
	public static void main(String[]ags) {
		//��Ϊ10 �� 4 �������� ������������Ľ��Ҳ������
		System.out.println(10/4);//��ѧ�н����2.5 ����java����2
		System.out.println(10.0/4);//��Ϊ10.0��double�� ���Խ��ҲΪdouble��=2.5
		double  d =10/4;//10 �� 4���������� ���ҲΪ�����Ͳ��ܱ���С�� =2
		//				����ǰ�涨����double����  ���Խ��Ϊ2.0
		//�൱��  double = 2
		System.out.println(d);
		System.out.println("-----ȡģ��ȡ�ࣩ-----");
		//ȡ��ı�����  a%b = a-a/b*b
		System.out.println(16%3);//1  16-16/3*3  ���� 16/3 16��3�����������Խ��ҲΪ����5
		System.out.println(-16%3);//-1
		System.out.println(16%-3);//1
		System.out.println(-16%-3);//-1
		System.out.println("----����-----");
		int i =10;
		//����ʹ��ʱ
		i++;//�൱�� i = i + 1
		++i;//Ҳ���൱�� i=i+1 ��ʱ��i=11
		System.out.println("i++="+i);//���Դ�ʱ��i=12
		//��Ϊ���ʽʹ��ʱ
		int a =10;
		//int b = ++a;//a++ʱ��������ֵ �൱�� a=a+1 ;b=a  a=11 b=11
		int b = a++;//++aʱ�ȸ�ֵ������ �൱�� b=a ; a=a+1  a=11 b=10
		System.out.println("a="+a+"\n"+"b="+b);
		System.out.println("---------i++��++i��������---------");
		int t =1;
		//t = t++;//��ʱ��ʹ����ʱ����temp  �ȸ�ֵ������  
			/*1.  temp =t =1
			 * 2. t = t+1  t=2
			 * 3. t = temp
			 * ���� t���=1
			 */
		t=++t;//���ǻ�ʹ����ʱ���� temp  ��������ֵ
			/*1. ������  t = t+1  t =2 
			 * 2. temp  = t =2
			 * 3.  t = temp =2
			 * ���� �����t t=2
			 */
		System.out.println(t);
		System.out.println("------��ϰ-------");
		int s1=10;
		int s2=20;
		int s =s1++;
		System.out.println("s="+s+"\n"+"s1="+s1);//
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
