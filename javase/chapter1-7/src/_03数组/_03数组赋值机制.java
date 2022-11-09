package _03数组;

public class _03数组赋值机制 {

	public static void main(String[] args) {
		int n1 =10; 
		int n2 = n1;
		n2 =80;
		System.out.println("n1="+n1);
		System.out.println("n2="+n2);
/*
 * 这是基本类型赋值，赋值方式为值拷贝
 * 即n2的变化不会影响到n1的值
 * 
 */
		
		
		/*
		 * 数组在默认情况下是引用传递，赋的值时地址，赋值方式为引用赋值
		 * arr2的变化会影响arr1 
		 */
		int [] arr1= {11,2,3};
		int [] arr2=arr1;//这种情况下相当于把arr1的地址直接复制给arr2 相当于共用一个地址
		for(int i =0;i<arr1.length;i++) {
			System.out.println("arr1数组的值为"+arr1[i]);
		}
		arr2 [0]=12;
		for(int i =0;i<arr1.length;i++) {
			System.out.println("arr2修改之后arr1数组的值为"+arr1[i]);
		}
		int arr3 [] = new int[arr1.length];//此时时arr3新建了一个地址 再单独把arr1中的元素给arr3
		for(int i =0;i<arr1.length;i++) {//arr1和arr3不共用一个地址 因此arr3不会影响arr2和arr1
			arr3[i]=arr1[i];
		}
		arr3[0]=13;
		for(int i =0;i<arr1.length;i++) {
			System.out.println("arr3修改之后arr1数组的值为"+arr1[i]);
	}
		System.out.println("---------------------------");
		for(int i =0;i<arr1.length;i++) {
			System.out.println("arr3数组的值为"+arr3[i]);
	}
		
		
		
		
	}
}
