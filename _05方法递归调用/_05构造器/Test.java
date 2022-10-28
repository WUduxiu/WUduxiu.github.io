package _05方法递归调用._05构造器;

public class Test {
    int age = 20;
    public static void main(String[] args) {
        T t = new T();
        t.test1();//方法前没有static的只能 新建对象 用对象.的形式调用
        T.test2();//方法前带了 static的 用 类名.的方法来调用

    }
}
class  T{
   public  void test1() {

        int age = 20;
    }
   public static void test2(){

   }

}

