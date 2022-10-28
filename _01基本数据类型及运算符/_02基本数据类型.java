package _01基本数据类型及运算符;

public class _02基本数据类型 {
	public static void main(String[]args) {
		/*数据类型转换默认从小值转换到大值
		 * 
		 * char-int-long-float-double
		 * byte-short-int-long-float-double
		 * 单引号''里面是char类型
		 * 双引号""里面是字符转 String
		 * char short byte这三种类型不能互相自动转换
		 * char short byte三种类型参与计算  首先转换为int类型
		 * byte b1 =1;
		 * byte b2=1;
		 * byte = b1+b2;错误：因为 b1+b2已经被转换成int类型 int类型不能转成成byte类型
		 * 
		 * 
		 */		
		int num = 'a';
		//a是char类型 char可以转成int
		double b =80;
		String name ="张三";
		//80是int型 可以转换成 double
		System.out.println(num);
		System.out.println(b);
		System.out.println("名字是"+name);
		System.out.println("----------");
		int a1 =1;
		float c = 1+1.1f;
		byte n1 =10;
		//char n2 =n1; 此时你的n1已经是byte类型 byte与char类型不能自动互相转换
		System.out.println(c);
		System.out.println(n1);
		System.out.println("---------");
		int t =(int)(1.1+1.8);
		System.out.println(t);
		System.out.println("--------");
		char h =100;
		System.out.println(h);
		
	}
}
