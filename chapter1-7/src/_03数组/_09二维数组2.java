package _03数组;

public class _09二维数组2 {

	public static void main(String[] args) {
	//动态创建
		int a[][];
		a = new int[10][];//创建二维数组，但是只确定一维数组的个数，但是一维数组还没开空间
		for(int i=0;i<a.length;i++) {
			a[i]= new int[i+1];//给每个一维数组开辟空间
			for(int j=0;j<a[i].length;j++) {//遍历一维数组，并给每个一维数组每个元素赋值
				a[i][j]=i+1;
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int n=0;n<a[i].length;n++) {
				System.out.print(a[i][n]);
			}
			System.out.println();
		}
		
	}

}
