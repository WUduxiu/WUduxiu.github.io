package _02�����ж����;

public class _14��ת������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++) {
			//Math.random()�������0-1��С�������ǲ���ȡ��1��
			System.out.println((int)(Math.random()*100+1));
			if((int)(Math.random()*100+1)==97) {
				System.out.println("�����"+i+"��");
				break;
			}	
			System.out.println("��"+i+"��û�����");
		}
		int a=0;
		for(;a<10;a++) {
			if(a==3) {break;}
			System.out.println("ѭ����"+a);			
		}	
		System.out.println(a);
		
		
		
		
		
		
		
	}

}
