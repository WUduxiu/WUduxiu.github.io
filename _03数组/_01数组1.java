package _03数组;

import java.util.Scanner;

public class _01数组1 {

	public static void main(String[] args) {
		//数组的长度为 数组名.length
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入鸡的体重");	
		double all=0;
		double [] hens = {3,5,1,3.4,2,50,100};
		System.out.println("数组的长度为"+hens.length);
		for(int i= 0;i<hens.length;i++) {
			System.out.println("第"+(i+1)+"个的元素的值为"+hens[i]);
			all=all+hens[i];
		}
		System.out.println("总和为"+all+"\n"+"平均值为"+(all/hens.length));
	}

}
