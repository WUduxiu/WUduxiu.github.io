package _03数组;

public class _02数组练习 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[] = new char [26];
		 for(int i=0;i<a.length;i++) {
			a[i]=(char) ('A'+i);
			 System.out.print(a[i]+" ");
		 }
		 System.out.println("\n"+"----------------");
		 int b[] = {114,-1,9,10,23};
		 int max =b[0];//假设b[0]为最大值
		 int indexmax = 0;//则最大值的下标为 0
		 for(int i=1;i<b.length;i++) {
			if(max<b[i]) {
				max = b[i];
				indexmax = i;
			}
			
		 }
		 System.out.println("最大值为"+max+"下标为"+indexmax);
		 
	}

}
