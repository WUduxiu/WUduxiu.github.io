package _02�����ж����;

public class _09whileѭ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//whileֱ��ִ��ѭ��
		int i=1;
		while( i<5) {
			
			System.out.println(i);
			i++;
		}
		System.out.println("----------------------");
		
		
	int start=1;
	int end =200;
	int s=0;
	int sum=0;
	while(start<=end) {
		if(start%2==0) {
			System.out.println(start);
			s++;
			sum+=start;
		}
		start++;
		
		
	}
		System.out.println("����Ϊ"+s);
		System.out.println("�ܺ�Ϊ"+sum);
		
		
		
	}

}
