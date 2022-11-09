package _04面向对象编程;


import java.util.Scanner;

public class _08成员方法传参机制 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        Scanner scanner = new Scanner(System.in);
        A1 aa = new A1();
        aa.swap(a, b);
        System.out.println("a=" + a + "b=" + b);
        B1 b1 = new B1();
        int[] arr = {1, 2, 3};
        System.out.println("main方法中数组的打印");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        b1.test100(arr);
        Boy boy = new Boy();
        boy.age = 10;
        boy.name = "小王";
        System.out.println(boy.age + "" + boy.name);
        C1 c1 = new C1();
        c1.test200(boy);
        System.out.println(boy.age + "" + boy.name);
    }
}
    class  A1{//传递基本数据类型 形参无法影响实参
        public void swap(int a,int b){
            System.out.println("交换前a="+a+"交换前b="+b);
            int temp = a;
            a = b;
            b = temp;
            System.out.println("交换后a="+a+"交换后b="+b);

        }
    }
    class  B1{//传递引用数据类型 实际是传递地址 形参可以影响实参
        public void test100(int[] arr){
            System.out.println("test100方法中的数组打印");
            arr[0]=200;
            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i]+"\t");
            }
            System.out.println();
        }
    }
    class Boy{
        int age;
        String name;
    }
    class C1{
        public void test200(Boy boy){
            boy = new Boy();


        }
    }

