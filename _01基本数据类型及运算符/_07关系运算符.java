package _01基本数据类型及运算符;

public class _07关系运算符 {
	//关系运算符的结果都是boolean值 要么为true 要么为false
	public static void main(String[]args) {
		int a =1;
		int b =2;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a>=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		boolean flag1 = (a<b);
		boolean flag2 = (a>b);
		System.out.println(flag1+"\n"+flag2);
	}
}
