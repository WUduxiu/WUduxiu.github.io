package _03数组;

import java.util.Scanner;

public class _01数组2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 数组的动态初始化
		 * double[] scores;
		 * scores = new double[5];
		 */
		//数组的静态初始化
		Scanner scanner = new Scanner(System.in);	
		double [] scores = new double[5];
		for(int i=0;i<scores.length;i++) {
			System.out.println("第输入"+(1+i)+"个元素的值");
			scores[i] = scanner.nextDouble();
		}
		System.out.println("=====该数组的值为=====");
		for(int i=0;i<scores.length;i++) {
			System.out.println("第"+(i+1)+"个的元素值为"+scores[i]);
	}
	}
}
