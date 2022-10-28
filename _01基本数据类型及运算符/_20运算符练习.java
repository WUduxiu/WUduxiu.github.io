package _01基本数据类型及运算符;

public class _20运算符练习 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(10/3);
		System.out.println(10/5);
		System.out.println(10%2);
		System.out.println(-10.5%3);
		//a%b 当a为小数时，公式为 = a-(int)a/b*b
		//-10.5-(int)-10.5/3*3=-10.5-(-10)/3*3=-10.5-(-9)=-1.5
		//有小数参与的计算得到的结果是近似值
		int i = 66;
		System.out.println(++i+i);//先自增后赋值 =67+67=134
		int num1 = Integer.parseInt("18");//int num1 = "18";
		//int类转String类需要用包装的方法 即Integer.parseInt("")
		int num2 = (int)18.0; // int num2 = 18.0;
		//18.0为double类不能转为int类
		double num3 = 3d;//正确
		//3d相当于 3double
		double num4 = 8;//正确
		//8为int类可以转成double类
		int c = 48; char ch = (char)+(c+1);//int c = 48; char ch = c+1;
		//c+1此时已经为int类型 需要强转
		byte b =19; short s = (short)(b+2);//byte b =19; short s = b+2;
		//b+2此时已经为int类型 需要强转
		
		
		
		
		
		
		
		
	}

}
