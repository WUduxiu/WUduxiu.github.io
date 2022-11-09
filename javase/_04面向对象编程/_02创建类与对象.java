package _04面向对象编程;

public class _02创建类与对象 {

	public static void main(String[] args) {
		
		/*new Cat()创建了一只猫
		 * Cat cat1 = new Cat();
		 * 把创建的一只猫赋给了cat1
		 */
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 4;
		cat2.color = "花色";
	}
	
}
/*访问修饰符 ： 控制属性的访问范围
 * 有四种访问修饰符 public protected 默认 private 
 * 例如 protected String name、private String name
 * 	
 * 
 */
	class Cat{
		String name;//定义的属性可以为任意  包含基本数据类型（int、double....）和引用类型（对象、数组、String）
		int age;//属性不赋值的话会有默认值
		String color;
	}
	class Car{
		String name;
		double price;
		 String color;
		 String [] master;//属性是基本数据类型也可以是引用类型（数组、对象）
	}

