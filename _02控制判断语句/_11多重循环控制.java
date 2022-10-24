package _02控制判断语句;

import java.util.Scanner;

public class _11多重循环控制 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("i="+i+"j="+j);
			}
		}
	
		Scanner scanner = new Scanner(System.in);
		double all =0;
		int c=0;
		for(int b=1;b<=3;b++) {
			double sum = 0;
			for(int a=1;a<=5;a++) {
				System.out.println("请输入"+b+"班第"+a+"个学生的成绩");
				double score = scanner.nextDouble();
				if(score>60.0) {
					c++;
				}
				System.out.println("第"+b+"班第"+a+"个学生的成绩为"+score);
				sum=sum+score;				
			}
				all=all+sum;
			System.out.println(b+"班总成绩为"+sum+"\n"+b+"班平均分为"+sum/5);				
		}
		System.out.println("所有班的总成绩为"+all+"所有学生的平均分为"+(all/15));
		System.out.println("三个班几个人数为"+c);
}
}
