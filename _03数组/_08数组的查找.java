package _03数组;

import java.util.Scanner;

public class _08数组的查找 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.顺序查找
		int index=-1;	
		String name[]= {"小明","小红","小张","小李"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要查找的人名");
		String getname = scanner.next();
		for(int i=0;i<name.length;i++) {
			//比较字符串 equals，如果要找到名字就是当前元素
			if(getname.equals(name[i])) {
				System.out.println("找到了"+getname+"在该数组的下标为"+i);
				index = i;
				break;
			}else {
				System.out.println("很可惜第"+(i+1)+"次没找到");
			}
		}
		if(index==-1) {
			System.out.println("对不起你要查找的对象不在这个数组中");
		}
	}

}
