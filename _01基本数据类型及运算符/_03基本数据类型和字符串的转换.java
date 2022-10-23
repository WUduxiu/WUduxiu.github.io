package _01基本数据类型及运算符;

public class _03基本数据类型和字符串的转换 {
	public static void main (String[]args) {
		int n1 =100;
		float f1 =102.3f;
		double d1 = 2.2;
		boolean b1 = true;
		char c1 = '吴';
		String s1 = n1+"一";
		String s2 = f1+"二";
		String s3 = d1+"三";
		String s4 = b1+"四";
		String s = c1 + "五";
		System.out.println(s+"空格");
		System.out.println("-------");
		String s5 ="3.14";
		String s6 ="3";	
		int num1=(int)(Integer.parseInt(s6));
		float num2=(float)(Float.parseFloat(s5));
		double num3=Double.parseDouble(s5);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		
	}
}
