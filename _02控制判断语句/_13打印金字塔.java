package _02�����ж����;

public class _13��ӡ������ {

	public static void main(String[] args) {
		for(int a=1;a<=5;a++) {
			//���*֮ǰ ����ո�
			for(int c = 1;c<=5-a;c++) {
				System.out.println(" "); 
			}
			for(int b=1;b<=2 * a- 1;b++) {//a��ʾ���� 
				System.out.print("*");//b��ʾ*�ĸ���
			}
			System.out.print("");
		}

}
}
