package _03数组;

public class _07数组的排序冒泡排序 {
/*遇到比较大小的时候
 * 可以先创建一个临时变量来储存大的值
 * 再将大的值放到对应的位置
 * 
 */
	public static void main(String[] args) {
		int a[] = {24,69,80,57,13,77};
		int temp =0;
		for(int n=0;n<a.length-1;n++) {//对应的外循环
			for(int i=0;i<a.length-1-n;i++) {	//对应的内循环（用来比较的次数）
				if(a[i]>a[i+1]) {
					temp = a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					}		
			}
			System.out.println("\n"+"第"+(n+1)+"轮的结果");
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
		}
			
		
		
		

	}

}
