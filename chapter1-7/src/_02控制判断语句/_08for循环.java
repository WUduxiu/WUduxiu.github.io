package _02控制判断语句;

public class _08for循环 {

	public static void main(String[] args) {
		 //for循环是先执行初始化变量  后执行循环
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
		System.out.println("个数="+count);
		System.out.println("总和="+sum);
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
