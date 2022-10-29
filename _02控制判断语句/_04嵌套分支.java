package _02控制判断语句;

import java.util.Scanner;

public class _04嵌套分支 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("请输入分数");
		double score = scanner1.nextDouble();
		if(score>8.0) {
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("请输性别");
			char gender = scanner2.next().charAt(0);
			if(gender=='男') {
				System.out.println("恭喜进入男子组");
			}else if(gender=='女'){
				System.out.println("恭喜进入女子组");
			}else {
				System.out.println("输入性别有误");
			}
		}else {
			System.out.println("淘汰");
		}
		String a = "123";
		a.toString();
	}

}
