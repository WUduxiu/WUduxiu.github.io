package _01基本数据类型及运算符;

public class _09逻辑运算符短路或和逻辑或 {
	/*||短路或：a||b  a或b为true a||b为true
	 * |逻辑或：a|b   a或b为true a|为true
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 =4;
		int b1 =5;
		if(a1>1 || b1>1) {//短路或  a或b为真 则a||b为真
			System.out.println("结果为真");
		}else {
			System.out.println("结果为假");
		}//当短路或||第一个条件为真时 后面的条件则不会再判断（高效率）
		System.out.println("a1="+a1+"\n"+"b1="+b1);
		
		int a2 = 4;
		int b2 = 5;
		if(a2>1 | b2>1) {//逻辑或和短路或一样 一个条件为真则为真
			System.out.println("结果为真");
		}else {
			System.out.println("结果为假");
		}//当逻辑与&第一个条件为真时 后面的条件还会再判断
		System.out.println("a2="+a2+"\n"+"b2="+b2);
		
	}
}
