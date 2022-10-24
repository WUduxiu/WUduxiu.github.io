package _02¿ØÖÆÅĞ¶ÏÓï¾ä;

import java.util.Scanner;

public class _20¿ØÖÆÓï¾äÁ·Ï°2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int count=0;	
			for(;i<=100;i++) {
				if(i%5!=0) {
					System.out.print(i+"\t");
					count++;
					if(count%5==0) {
						System.out.println("\n");
					}
				}
			}
			System.out.println("\n"+count);
			
			//char n1='a';//97
			//char n2 ='z';//122
			//char n3 ='A';//65
			//char n4= 'Z';//90
//			for(char j =97;j<=122;j++) {
//				System.out.println(j);
//			}
//			for(char k =65;k<=90;k++) {
//				System.out.println(k);
//			}
			
			for(char c1='a';c1<='z';c1++) {
				System.out.print(c1+" ");
			}
			System.out.println("======");
			for(char c2='Z';c2>='A';c2--) {
				System.out.print(c2+" ");
			}
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("ÇëÊäÈëÂëÖµ");
			int o = scanner.nextInt();
			char p = (char) o;
			System.out.println(p);
			System.out.println("ÊäÈë£º");
			char c =scanner.next().charAt(0);
			System.out.println(c);
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

}
