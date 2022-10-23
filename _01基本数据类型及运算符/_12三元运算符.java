package _01基本数据类型及运算符;

public class _12三元运算符 {

	public static void main(String[] args) {
		// 
		int a = 10;
		int b = 100;
		int result = a>b ? a++ : b--;//若条件为真则执行第一个  为假执行第二个（一真大师）
		System.out.println("result="+result);//100 因为b--是先赋值后自减
		//所以会先将 b=100传给result 
		System.out.println("a="+a);//10
		System.out.println("b="+b);//99
		System.out.println("--------");
		int x =7;
		int y = 6;
		int c =x>y ? 10 : 11 ;
		System.out.println("x="+x+"y="+y);
		System.out.println("c="+c);
		System.out.println("-------------");
		int n1 = 55;
		int n2 = 44;
		int n3 = 41;
		int t1 = n1>n2 ? n1 : n2;
		int t2 = t1>n3 ? t1 : n3;
		System.out.println("最大值为"+t2);
		int q =10;
		int p =5;
		if(2<1) {
			 q++;
		}else {
			p++;
		}
		System.out.println("q="+q+"\n"+"p="+p);
		
		
		
		
		
	}

}
