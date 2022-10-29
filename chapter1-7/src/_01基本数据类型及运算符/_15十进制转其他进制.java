package _01基本数据类型及运算符;

public class _15十进制转其他进制 {

	public static void main(String[] args) {
		// 1.十进制转二进制
		//将该数不断除以2，直到商为0为止，然后将余数倒过来，就是对应的二进制
		int n1 = 0b100010;//34 -> 0b00100010 因为一个字节有8位要填充高位
		System.out.println(n1);
		//----------------------
		//2.十进制转八进制
		//将该数不断除以8，直到商为0为止，然后将余数倒过来，就是对应的八进制
		int n2 = 0203;//131 -->0203
		System.out.println(n2);
		//---------------------------
		// 1.十进制转十六进制
		//将该数不断除以16，直到商为0为止，然后将余数倒过来，就是对应的十六进制
		int n3 = 0xED;
		System.out.println(n3);
		//-----------------------
		int t1=0b1111011;
		int t2=01246;
		int t3=0x22d0;
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
	}

}
