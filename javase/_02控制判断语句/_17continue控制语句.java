package _02控制判断语句;

public class _17continue控制语句 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1;
		while(i<=4) {
			i++;			
			if(i==2) {
				continue;
			}
			System.out.println("i="+i);
		}
		lable1 :
			for(int j=0;j<4;j++) {
				lable2 :
					for(int k=0;k<10;k++) {
						if(k==2) {
							continue lable2;
						}
						System.out.println("k="+k);
					}
						System.out.println("j="+j);
			}
		
		
		
		

	}

}
