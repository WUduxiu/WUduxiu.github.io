package _01�����������ͼ������;

public class _19λ�����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*λ����� >> << �� >>>
		 * ��������>> :��λ���������λ������ߣ����䣬���÷��Ų�����ĸ�λ
		 * �������� <<:��λ���������λ������ߣ����䣬��λ��0
		 * >>>�߼�����Ҳ���޷������ƣ���������ǣ���λ�������λ��0��������)
		 * û��<<<����
		 */	
		int n1 = 8>>2;//�൱�� 1000-->0010= 8/2/2=2(����Ҫת���ɲ��������������)
		int n2 = 8<<2;//00001000--> 00100000 = 8*2*2=32
		int n3 = 8>>>2;//1000-->0010=2
		int n4 = -8>>>2;//
		System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4);
		int a = 1>>2;//0
		int b = -1>>2;//-1
		int c = 1<<2;//4
		int d = -1<<2;//-4
		int e = 3>>>2;//0
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}

}
