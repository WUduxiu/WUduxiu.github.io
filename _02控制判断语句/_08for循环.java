package _02�����ж����;

public class _08forѭ�� {

	public static void main(String[] args) {
		 //forѭ������ִ�г�ʼ������  ��ִ��ѭ��
		int q=1;
		for(;q<3;q++) {
			System.out.println("q="+q);
		}
		System.out.println("q="+q);
		
		
		int s =5;
		int start = 1;
		int end = 100;
		int count =0;
		int sum =0;
		for(int i =start;i<=end;i++) {
			if(i%s==0) {
				System.out.println("i="+i);
				count++;
				sum+=i;
			}
		}
		System.out.println("����="+count);
		System.out.println("�ܺ�="+sum);
		//---------------------------
		int n =5;
		int c;
		for(int t = 0;t<=n;t=t+2) {
			System.out.println(t+"+"+(n-t)+"="+n);
			c=t*(t+2);
			System.out.println(c);
		}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}