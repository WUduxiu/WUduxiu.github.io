package _01�����������ͼ������;

public class _04�ַ�����ʹ�� {
	public static void  main (String[]args) {
		char n = '\n';
		char n1 = '\t';
		char n2 = '\r';
		char n3 = '\\';
		char n4 = '1';
		char n5 =88;
		System.out.println("n"+n);
		System.out.println("n1"+n1);
		System.out.println("n2"+n2);
		System.out.println("n3"+n3);
		System.out.println("n4"+n4);
		System.out.println("n5"+n5);
		System.out.println("-----------");
		String book1 = "����";
		String book2 ="��ѧ";
		System.out.println("������"+book1+"��"+book2);
		System.out.println("-------");
		String name ="����";
		int age = 21;
		double sorce = 88.88;
		char gender = '��';
		//char ��string ������
		//charֻ�ܴ���һ���ַ� string���Դ������ַ�
		String hobby = "����";
		System.out.println("����\t����\t�ɼ�\t�Ա�\t����\n"+name+"\t"+age+"\t"+sorce+"\t"+gender+"\t"+hobby);
		System.out.println(gender+""+age);
		//char������+ֱ�����ӻ�ת����int��
		System.out.println(gender+age);
		System.out.println(name+age);
	}
}
