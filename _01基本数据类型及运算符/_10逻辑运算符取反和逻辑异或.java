package _01�����������ͼ������;

public class _10�߼������ȡ�����߼���� {
	//ȡ�� !
	public static void main(String[]args) {
		System.out.println(1>2);
		System.out.println(!(1>2));
		System.out.println("---------");
		//a^b ���߼���� a��b������ͬʱΪflase  a��b������ͬʱΪtrue
		boolean b1 = (1>2)^(1>3);
		boolean b2 = (2>1)^(1>3);
		System.out.println(b1+"\n"+b2);
		
		
	}
}
