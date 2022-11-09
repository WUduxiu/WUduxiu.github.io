package _03数组;

import java.util.Scanner;

public class _06数组的删减 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int	count =a.length;
	lable1 :
		do {
			if(count>1) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("是否继续缩减 y/n");
				char c = scanner.next().charAt(0);
				switch(c) {
				case 'y' :
					int b[] = new int [count-1];
					for(int i=0;i<count-1;i++) {
						b[i]=a[i];
						System.out.print(a[i]+" ");
					}
					count--;
					break;
				case 'n' :
					break  lable1;
				}
			}else {
				System.out.println("该数组只剩最后一个元素无法缩减");
				break lable1;
			}
			
		}while(true);
			System.out.println("退出了缩减程序");
	}
}


