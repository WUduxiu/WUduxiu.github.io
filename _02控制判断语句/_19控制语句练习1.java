package _02控制判断语句;

import java.util.Scanner;

public class _19控制语句练习1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double money =100000;
		int i =0;
		while(true) {
			if(money>50000) {
				money = money-(money*0.05);
				i++;
			}else if(money>=1000) {
				money = money-1000;
				i++;
			}else {
				
				break;
			}

		}
		System.out.println("经过了"+i+"个路口");
		int a,b,c,n;//a为个数，b为十位数，c为百位数，n为其组成的数。
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要判断的数的个位");
		a = scanner.nextInt();
		System.out.println("请输入要判断的数的十位");
		b = scanner.nextInt();
		System.out.println("请输入要判断的数的百位");
		c = scanner.nextInt();
		System.out.println("所以得到的三位数为"+(a+10*b+100*c));
		if((a*a*a)+(b*b*b)+(c*c*c)==(a+10*b+100*c)) {
			System.out.println("该数为水仙花数");
		}else {
			System.out.println("该数不是水仙花数");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
