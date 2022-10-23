package _01基本数据类型及运算符;

public class _11逻辑运算符的练习 {
//短路与 和短路或都是先看第一个条件
	/*
	 * 短路与 第一个条件为假则全为假 第二个条件不判断--第一个条件为真时 会继续判断第二个条件
	 * 短路或 第一个条件为真是则全为真 第二个条件不判断--第一个条件为假时 会继续判断第二个条件
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 5;
		if(x++==5 & ++y==6) {
			//x++先赋值再自增 相当于是先比较 所以 x++==6条件为假
			x=11;
		}
		System.out.println("x="+x+"y="+y);
		int a = 5,b = 5;
		if(++a==6 && b++==5) {
			a = 11;
		}
		System.out.println("a="+a+"b="+b);
		int n =5,m=5;
		if(++n==5 || m++== 5) {
			n = 11;
		}
		System.out.println("n="+n+"m="+m);
		System.out.println("----------");
		boolean j = true;
		boolean k = false;
		short z = 46;
		if((z++==46) && (k==true))z++;		
		if((j==false) || (++z==49))z++;
		System.out.println("z="+z);
			
		boolean q = true;
		boolean p =false;
		int t =1;
		if((q==false)&&(++t==1)){
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		System.out.println("t="+t);
		
		
		
		
		}
		
		
		
	
	

}
