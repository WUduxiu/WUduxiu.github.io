package _01基本数据类型及运算符;



//加减乘除 取余
//+ - * / %
public class _05运算符的加减乘除及取余 {
	public static void main(String[]ags) {
		//因为10 和 4 都是整数 所以运算出来的结果也是整数
		System.out.println(10/4);//数学中结果是2.5 但在java中是2
		System.out.println(10.0/4);//因为10.0是double型 所以结果也为double型=2.5
		double  d =10/4;//10 和 4都是整数型 结果也为整数型不能保留小数 =2
		//				但是前面定义了double类型  所以结果为2.0
		//相当于  double = 2
		System.out.println(d);
		System.out.println("-----取模（取余）-----");
		//取余的本质是  a%b = a-a/b*b
		System.out.println(16%3);//1  16-16/3*3  其中 16/3 16和3都是整数所以结果也为整数5
		System.out.println(-16%3);//-1
		System.out.println(16%-3);//1
		System.out.println(-16%-3);//-1
		System.out.println("----自增-----");
		int i =10;
		//单独使用时
		i++;//相当于 i = i + 1
		++i;//也是相当于 i=i+1 此时的i=11
		System.out.println("i++="+i);//所以此时的i=12
		//作为表达式使用时
		int a =10;
		//int b = ++a;//a++时先自增后赋值 相当于 a=a+1 ;b=a  a=11 b=11
		int b = a++;//++a时先赋值后自增 相当于 b=a ; a=a+1  a=11 b=10
		System.out.println("a="+a+"\n"+"b="+b);
		System.out.println("---------i++和++i的面试题---------");
		int t =1;
		//t = t++;//此时会使用临时变量temp  先赋值后自增  
			/*1.  temp =t =1
			 * 2. t = t+1  t=2
			 * 3. t = temp
			 * 所以 t输出=1
			 */
		t=++t;//还是会使用临时变量 temp  先自增后赋值
			/*1. 先自增  t = t+1  t =2 
			 * 2. temp  = t =2
			 * 3.  t = temp =2
			 * 所以 输出的t t=2
			 */
		System.out.println(t);
		System.out.println("------练习-------");
		int s1=10;
		int s2=20;
		int s =s1++;
		System.out.println("s="+s+"\n"+"s1="+s1);//
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
