package _02控制判断语句;

public class _14跳转控制语句 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++) {
			//Math.random()随机生成0-1的小数（但是不能取到1）
			System.out.println((int)(Math.random()*100+1));
			if((int)(Math.random()*100+1)==97) {
				System.out.println("随机了"+i+"次");
				break;
			}	
			System.out.println("第"+i+"次没随机到");
		}
		int a=0;
		for(;a<10;a++) {
			if(a==3) {break;}
			System.out.println("循环了"+a);			
		}	
		System.out.println(a);
		
		
		
		
		
		
		
	}

}
