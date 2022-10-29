package _03数组;

import java.util.Scanner;

public class _05数据的扩容 {

	public static void main(String[] args) {
		int a[] = {1,2,3};
			lable1 :
		do {
			int newnum ;
			int count =1;
			int b[] =new int [a.length+count];
			count++;
			for(int i=0;i<a.length;i++) {
				b[i]=a[i];
			}
			char c;
			Scanner scanner = new Scanner(System.in);
			System.out.println("\n"+"是否继续添加y/n");
			c = scanner.next().charAt(0);
			switch(c){
			case 'y' :
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("请输入要添加的数");
				newnum = scanner1.nextInt();
				b[b.length-1]=newnum;
				a=b;
				break;
			case 'n' :
			break lable1;
			
			}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			
		}
		}while(true);
			System.out.println("退出添加程序");
		
		

	}

}
