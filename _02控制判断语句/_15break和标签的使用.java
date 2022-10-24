package _02控制判断语句;

public class _15break和标签的使用 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lable1 :
			for(int a=0;a<=4;a++) {
				System.out.println("a="+a);
				if(a==2) {
					break lable1;
				}
				lable2:
					for(int b=0;b<10;b++) {
						System.out.println("b="+b);
						if(b==2) {
							System.out.println("b="+b);
							break lable2;
							//不添加标签的话默认执行最近的break
						}
					}
			}
	}

}
