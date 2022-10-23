package _01基本数据类型及运算符;
import java.util.*;

public class _13键盘输入语句 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);//scanner 为名字
		System.out.println("请输入姓名");
		String name = scanner.next();////scanner 为名字
		//next后面可以加上自己使用的数据类型 如：nextInt()此时为int类型
		System.out.println("姓名="+name);
	}

}
