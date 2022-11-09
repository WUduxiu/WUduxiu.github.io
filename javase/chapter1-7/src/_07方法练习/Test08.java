package _07方法练习;

public class Test08 {
    int count = 9;
    public void count1() {
        count = 10;//因为这个方法没有形参 方法里面的count就是 类的属性 count
        System.out.println("count1="+count);//10
    }
    public void count2(){
        System.out.println("count1="+(++count));//count++ 先输出，后自增  ++count 先输出，后自增
    }

    public static void main(String[] args) {
        new Test08().count1();//
        /*
        new Test08()是一个匿名对象，匿名对象只能使用一次 使用后被销毁
        new Test08().count1() 创建匿名对象后就调用count1()方法
         */
        Test08 t = new Test08();//10
        t.count2();//9
        t.count2();//10


    }

}

