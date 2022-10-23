package _01基本数据类型及运算符;

public class _11赋值运算符 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		n+=4;//n+=4 相当于 n=n+4
		System.out.println("n="+n);
		System.out.println("------");
		byte b = 1;
		b+=5;//b=b+5 byte在计算时自动转换成int型 但是在赋值运算时有 
		//b=(byte)(b+5)自动进行了强转 转为byte类型
		b++;//b=(byte)(b+1) b++同理
		System.out.println("b="+b);
	}

}
