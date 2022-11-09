package _07方法练习;

public class Test10 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = d1;
        d2.m();
        System.out.println(d1.i);
        System.out.println(d2.i);
    }
}
class Demo{
    int i = 100;
    public void m(){
        int j = ++i;// i++是后++  先赋值后自增
        System.out.println("i="+i);//101
        System.out.println("j="+j);//100
    }
}
