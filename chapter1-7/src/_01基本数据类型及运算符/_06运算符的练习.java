package _01基本数据类型及运算符;

public class _06运算符的练习 {
	public static void main(String[]args) {
		int a =59;
		int b =7;
		int c =(a-(a%b))/b;
		int d =a%b;
		System.out.println("合"+c+"个星期零"+d+"天");
		
		double m =5;
		double n = 9;
		double h =234.5;
		double s = m/n*(h-100);
		System.out.println(s);
		System.out.println(5/10*10);//5/10=0.5 为int类型转换成double类型为0；0*10=0 所以输出结果为0
		
		
		
	}
}
