package _03数组;

public class _04数组反转 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int l =a.length;
		int temp =0;
		for(int i=0;i<l/2;i++) {
			temp =a[l-1-i];
			a[l-1-i]=a[i];
			a[i]=temp;  
		}
		for(int i=0;i<l;i++) {
			System.out.println("数组a的反转数组为"+a[i]);
		}
		//2.使用逆序便利法  
		/*
		 * 先创建一个新的数组c
		 * 将b中的元素逆向传入c中
		 * 在用b指向c
		 * b数组没被使用 会被销毁
		 */
		
		int b[]= {10,20,30,40,50,60,70};
		int c[]= new int [b.length];
		for(int i =b.length-1,j=0;i>=0;i--,j++) {
			c[j] = b[i];
		}
			b=c;
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		
		
		
		
	}

}
