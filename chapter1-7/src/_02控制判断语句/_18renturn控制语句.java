package _02控制判断语句;

public class _18renturn控制语句 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			if(i==3) {
				System.out.println("i="+i);
				return;//当return用在方法时，表示跳出方法，如果用在main，表示退出程序
				//break;
				//continue;
			}
			System.out.println("123");
		}
		System.out.println("程序继续运行");
	}

}
