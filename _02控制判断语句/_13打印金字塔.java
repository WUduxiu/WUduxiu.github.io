package _02控制判断语句;

public class _13打印金字塔 {

	public static void main(String[] args) {
		for(int a=1;a<=5;a++) {
			//输出*之前 输出空格
			for(int c = 1;c<=5-a;c++) {
				System.out.println(" "); 
			}
			for(int b=1;b<=2 * a- 1;b++) {//a表示层数 
				System.out.print("*");//b表示*的个数
			}
			System.out.print("");
		}

}
}
