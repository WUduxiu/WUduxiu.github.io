package _02控制判断语句;

public class _09while循环 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while直接执行循环
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
		System.out.println("个数为"+s);
		System.out.println("总和为"+sum);
		
		
		
	}

}
