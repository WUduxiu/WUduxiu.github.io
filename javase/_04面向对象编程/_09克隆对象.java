package _04面向对象编程;

public class _09克隆对象 {
    public static void main(String[] args) {
        MyTools myTools = new MyTools();
        myTools.print(2,3);
        man man = new man();
        man.age=20;
        man.name="小明";
        System.out.println("main方法中的"+man.name+"\t"+man.age );
         man man2 =   myTools.copyMan(man);
         //此时 man和man2是俩个属性相同但却是独立的对象
        System.out.println("复制的属性为"+man2.name+man2.age);
        //判断俩个对象是否独立
        System.out.println(man==man2);//结果为false 表示独立 是俩个不同的对象
    }
}
    class MyTools{
        public void print(int a,int b){
            int[][] arr = new int[a][b];
            for (int i = 0; i <arr.length ; i++) {
                for (int j = 0; j <arr[i].length ; j++) {
                    System.out.print(arr[i][j]+"\t");
                }
                System.out.println();
            }
        }
        public man copyMan(man man){
            man man2 = new man();
            man2.age=man.age;//把原来对象的年龄赋给man2.age
            man2.name=man.name;//把原来对象的名字赋给man2.name
            return man2;

        }
    }
    class man{
        int age;
        String name;
    }

