package _02控制判断语句;

import java.util.Scanner;

public class _07Switch分支结构练习 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("请输入要转换的字符（只限a-e）");
		char c = scanner1.next().charAt(0);
		switch(c){
			case 'a' :
				System.out.println("A");
			break;
			case 'b' :
				System.out.println("B");
			break;
			case 'c' :
				System.out.println("C");
			break;
			default :
				System.out.println("other");
		}
		//------------------------------------------
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("请输入成绩");
		/*先用double定义一个成绩
		 * 再用这个成绩/60，因为成绩不能大于100。所以得到结果的要么大于1 要么小于1
		 * 再将其用int强转 得到 0和1 俩个值
		 * 得到0就是小于60分  不合格
		 * 得到1就是大于60分   合格
		 * 
		 */
		double score = scanner2.nextDouble();
		int n = (int)(score/60);
		if(0<=score&&score<=100) {
			switch(n) {
			case 1 :
				System.out.println("合格");
			break;
			case 0 :
				System.out.println("不合格");
			break;			
	}
		}else {
			System.out.println("输入的成绩有误");
		}
		
		//----------------------
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("请输入月份");
		int mouth = scanner3.nextInt();
		//使用穿透来完成
		switch(mouth){
			case 3 :				
			case 4 :				
			case 5 :
				System.out.println("春季");
			break;
			case 6 :				
			case 7 :				
			case 8 :
				System.out.println("夏季");
			break;
			case 9 :				
			case 10 :				
			case 11 :
				System.out.println("秋季");
			break;
			case 12 :				
			case 1 :				
			case 2 :
				System.out.println("冬季");
			break;
			default :
				System.out.println("你输入的月份有问题");
		}
		
	}

}
