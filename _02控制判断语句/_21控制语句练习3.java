package _02�����ж����;

public class _21���������ϰ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i=1;
		double n=1;
		double sum1=0;
		double sum2=0;
		for(;i<=100;i++) {
			if(i%2!=0) {
				n=1/i;
				sum1=sum1+n;
				System.out.println(n);
			}else{
				n=1/i;
				sum2=sum2+n;
				System.out.println(n);
			}
		}
		System.out.println("��Ϊ"+(sum1-sum2));
			
			int k=1;
			int sum3=0;
			int sum4=0;	
			for(int j=1;j<=100;j++) {
				
				for(;k<=j;k++) {
				sum3=sum3+k;

			}
			}
				System.out.println(sum3);
				
		
		
		
		
		
		
		
		
	}
}
