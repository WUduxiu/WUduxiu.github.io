package _01基本数据类型及运算符;

public class _04字符串的使用 {
	public static void  main (String[]args) {
		char n = '\n';
		char n1 = '\t';
		char n2 = '\r';
		char n3 = '\\';
		char n4 = '1';
		char n5 =88;
		System.out.println("n"+n);
		System.out.println("n1"+n1);
		System.out.println("n2"+n2);
		System.out.println("n3"+n3);
		System.out.println("n4"+n4);
		System.out.println("n5"+n5);
		System.out.println("-----------");
		String book1 = "语文";
		String book2 ="数学";
		System.out.println("书名是"+book1+"和"+book2);
		System.out.println("-------");
		String name ="张三";
		int age = 21;
		double sorce = 88.88;
		char gender = '男';
		//char 和string 的区别
		//char只能储存一个字符 string可以储存多个字符
		String hobby = "打球";
		System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n"+name+"\t"+age+"\t"+sorce+"\t"+gender+"\t"+hobby);
		System.out.println(gender+""+age);
		//char类型用+直接连接会转换成int型
		System.out.println(gender+age);
		System.out.println(name+age);
	}
}
