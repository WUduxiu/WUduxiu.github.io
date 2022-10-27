package _02控制判断语句;

import java.util.Scanner;

public class _16break练习 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int n=0;//先定义一个数 后面再去拿计算后的结果赋值给它 作用域更大
		for(int c=1;c<=100;c++) {
			sum=c+sum;
			if(sum>20) {
				
				System.out.println("随机了"+c);
				n=c;
				break;
			}								
			}	
		System.out.println("循环了"+n);
		String name ="";
		String password ="";
		int chance=0;
		
		for(int d=1;d<=3;d++) {	
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入用户名");
			 name = scanner.next();
			System.out.println("请输入密码");
			 password = scanner.next();
			 /*
			  * 字符串进行比较使用equals方法
			  * 
			  * 
			  */
			if("小明".equals(name)&&"123456".equals(password)) {

				chance = d;
				break;
			}
				System.out.println("还剩"+(3-d)+"次机会");
			}
			if(chance>0) {
				System.out.println("登陆成功");
			}else {
				System.out.println("登陆失败");
			}
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		}
	


