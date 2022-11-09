package _03数组;

public class _本章练习2 {

	public static void main(String[] args) {
		
		int arra[] = new int[10];
		for(int i=0;i<10;i++) {
			arra[i]= (int) (Math.random()*100)+1;
		}
		int arrb[] = new int[arra.length];
		for(int i=0;i<arra.length;i++) {
			arrb[arra.length-1-i]=arra[i];
		}
		System.out.println("倒序前arra数组为");
		for(int i=0;i<arra.length;i++) {
			System.out.print(arra[i]+" ");
		}
		arra=arrb;
		System.out.println("倒序后arra数组为");
//		for(int i=arra.length-1;i>=0;i--) {
//			System.out.print(arra[i]+" ");
//		}
		int sum = 0;
		for(int i=0;i<arra.length;i++) {
			sum = sum +arra[i];
			System.out.print(arra[i]+" ");
		}
		
		System.out.println();
		System.out.println("数组arra的平均值为"+(sum/arra.length));
		int test =0;
		for(int i=0;i<arra.length;i++) {
			if(arra[i]==8) {
				System.out.println("第"+(i+1)+"次找到8且其下标为"+i);
				test++;
			}else {
				System.out.println("第"+(i+1)+"次没找到数字8");
			}
			
		}
		System.out.println("总共找到"+test);
		int maxindex = 0;
		int max =arra[0];
		for(int i=1;i<arra.length-1;i++) {
			if(max<arra[i]) {
				max = arra[i];
				maxindex = i;
			}
		}
		System.out.println("最大值为"+max+"下标为"+maxindex);
		int temp2 = 0;
		for(int n=0;n<arra.length-1;n++) {
			for(int i=0;i<arra.length-1-n;i++) {
				if(arra[i]>arra[i+1]) {
					temp2 = arra[i];
					arra[i] = arra[i+1];
					arra[i+1] = temp2;
				}
			}
		}
	
		System.out.println("--------------");
		
		char arr1 [] = {'a','z','b','c'};
		char arr2 [] = arr1;
		arr1[2] = '韩';
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr1[i]+","+arr2[i]);
		}
		
		
		
		
		
		
		
		
	}

}
