package _01�����������ͼ������;

public class _11�߼����������ϰ {
//��·�� �Ͷ�·�����ȿ���һ������
	/*
	 * ��·�� ��һ������Ϊ����ȫΪ�� �ڶ����������ж�--��һ������Ϊ��ʱ ������жϵڶ�������
	 * ��·�� ��һ������Ϊ������ȫΪ�� �ڶ����������ж�--��һ������Ϊ��ʱ ������жϵڶ�������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 5;
		if(x++==5 & ++y==6) {
			//x++�ȸ�ֵ������ �൱�����ȱȽ� ���� x++==6����Ϊ��
			x=11;
		}
		System.out.println("x="+x+"y="+y);
		int a = 5,b = 5;
		if(++a==6 && b++==5) {
			a = 11;
		}
		System.out.println("a="+a+"b="+b);
		int n =5,m=5;
		if(++n==5 || m++== 5) {
			n = 11;
		}
		System.out.println("n="+n+"m="+m);
		System.out.println("----------");
		boolean j = true;
		boolean k = false;
		short z = 46;
		if((z++==46) && (k==true))z++;		
		if((j==false) || (++z==49))z++;
		System.out.println("z="+z);
			
		boolean q = true;
		boolean p =false;
		int t =1;
		if((q==false)&&(++t==1)){
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		System.out.println("t="+t);
		
		
		
		
		}
		
		
		
	
	

}
