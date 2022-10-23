package _01基本数据类型及运算符;

public class _10逻辑运算符取反和逻辑异或 {
	//取反 !
	public static void main(String[]args) {
		System.out.println(1>2);
		System.out.println(!(1>2));
		System.out.println("---------");
		//a^b 叫逻辑异或 a和b条件相同时为flase  a和b条件不同时为true
		boolean b1 = (1>2)^(1>3);
		boolean b2 = (2>1)^(1>3);
		System.out.println(b1+"\n"+b2);
		
		
	}
}
