package _01基本数据类型及运算符;

public class _08逻辑运算符短路与和逻辑与 {
	/*&&短路与：a&&b a，b都为true a&&b为true
	 * &逻辑与：a&& a，b都为true a&b为true
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 =4;
		int b1 =5;
		if(a1<1 && ++b1>1) {//短路与&&俩个条件都满足才为真
			System.out.println("结果为真");
		}else {
			System.out.println("结果为假");
		}//当短路与&&第一个条件为假时 后面的条件则不会再判断（高效率）
		System.out.println("a1="+a1+"\n"+"b1="+b1);
		
		int a2 = 4;
		int b2 = 5;
		if(a2<1 & ++b2>1) {//逻辑与和短路与一样 俩个条件都满足才为真
			System.out.println("结果为真");
		}else {
			System.out.println("结果为假");
		}//当逻辑与&第一个条件为假时 后面的条件还会再判断
		System.out.println("a2="+a2+"\n"+"b2="+b2);
		
	}
}
