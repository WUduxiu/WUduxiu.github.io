package _03数组;

public class _09二维数组 {

	public static void main(String[] args) {
		int a[][]= {{0,0,0,0,0},{0,1,0,0,0},{0,2,0,0,0},{0,3,0,0}};
		for(int i=0;i<a.length;i++) {
			for(int n=0;n<a[i].length;n++) {
				System.out.print(a[i][n]+"\t");
			}
			System.out.println();
		}
		 int b[][] = new int [2][3];
		 for(int i=0;i<b.length;i++) {
			 for(int n=0;n<b[i].length;n++) {
				 System.out.print(b[i][n]+"\t");
			 }
			 System.out.println();
		 }
		
		
		
		
	}
}
