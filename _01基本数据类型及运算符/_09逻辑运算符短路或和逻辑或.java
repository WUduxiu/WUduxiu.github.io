package _01�����������ͼ������;

public class _09�߼��������·����߼��� {
	/*||��·��a||b  a��bΪtrue a||bΪtrue
	 * |�߼���a|b   a��bΪtrue a|Ϊtrue
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 =4;
		int b1 =5;
		if(a1>1 || b1>1) {//��·��  a��bΪ�� ��a||bΪ��
			System.out.println("���Ϊ��");
		}else {
			System.out.println("���Ϊ��");
		}//����·��||��һ������Ϊ��ʱ ����������򲻻����жϣ���Ч�ʣ�
		System.out.println("a1="+a1+"\n"+"b1="+b1);
		
		int a2 = 4;
		int b2 = 5;
		if(a2>1 | b2>1) {//�߼���Ͷ�·��һ�� һ������Ϊ����Ϊ��
			System.out.println("���Ϊ��");
		}else {
			System.out.println("���Ϊ��");
		}//���߼���&��һ������Ϊ��ʱ ����������������ж�
		System.out.println("a2="+a2+"\n"+"b2="+b2);
		
	}
}
