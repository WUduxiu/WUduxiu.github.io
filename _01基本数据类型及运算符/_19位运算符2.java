package _01基本数据类型及运算符;

public class _19位运算符2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*位运算符 >> << 和 >>>
		 * 算术右移>> :低位溢出，符号位（最左边）不变，并用符号补溢出的高位
		 * 算术左移 <<:高位溢出，符号位（最左边）不变，低位补0
		 * >>>逻辑右移也叫无符号右移，运算规则是：低位溢出，高位补0进行运算)
		 * 没有<<<符号
		 */	
		int n1 = 8>>2;//相当于 1000-->0010= 8/2/2=2(都是要转换成补码来进行运算的)
		int n2 = 8<<2;//00001000--> 00100000 = 8*2*2=32
		int n3 = 8>>>2;//1000-->0010=2
		int n4 = -8>>>2;//
		System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4);
		int a = 1>>2;//0
		int b = -1>>2;//-1
		int c = 1<<2;//4
		int d = -1<<2;//-4
		int e = 3>>>2;//0
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}

}
