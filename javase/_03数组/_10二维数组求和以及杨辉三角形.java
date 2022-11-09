package _03数组;

public class _10二维数组求和以及杨辉三角形 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum = 0;
//		int a[][] = {{4,6},{1,5,7},{-2}};
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				sum=sum+a[i][j];
//			}
//		}
//		System.out.println(sum);
		int arr[][] = new int[10][];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new int[i+1];//定义一维数组的元素个数  int[i+1];
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = 1;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(i>1) {
				for(int j=0;j<arr[i].length;j++) {
					if(j!=0&&j!=arr[i].length-1) {
						arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
						System.out.print(arr[i][j]+"\t");
					}else {
						
							System.out.print(arr[i][j]+"\t");
					
					}
					
			}
				
			}else {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+"\t");
			}
			}
			System.out.println();
		}
		
		
	}

}

