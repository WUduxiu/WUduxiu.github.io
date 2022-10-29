package _03数组;

public class _本章练习1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs[] = new String[]{"a","b","c"};
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
		String foo ="blue";
		boolean bar[] = new boolean[2];//boolean类型默认值是false
		if(bar[0]) {//所以bar[0]为false 不会执行if语句
			foo = "grenn";
		}
		System.out.println(foo);
		int num =1;
		while(num<10) {
			System.out.println(num);
			if(num>5) {
				break;
			}
			num+=2;
		}
		System.out.println("----------------------------");
		int a[] = {10,12,21,45,90};
		int insertNum = 23;
		int index = -1;
		for(int i=0;i<a.length;i++) {
			if(insertNum<=a[i]) {
				index = i;
				break;//找到位置后就立马退出 因为23<45 也<90 会影响
			}
		}
		if(index==-1) {
			index = a.length;
		}
		
		int b[] = new int[a.length+1];
		for(int i=0,j=0;i<b.length;i++) {
			if(i!=index) {
				b[i] = a[j];
				j++;
			}else {
				b[i] = insertNum;
			}
		}
//		for(int i=0,j=0;i<b.length;i++,j++) {
//			if(i<index) {
//				b[j] = a[i];
//			}else if(i>=index&&i<b.length-1) {
//				b[j+1] = a[i];
//			}
//		}
//		b[index] = insertNum;
		a=b;
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
