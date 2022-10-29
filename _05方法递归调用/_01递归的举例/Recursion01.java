package _05方法递归调用._01递归的举例;

public class Recursion01 {
    public static void main(String[] args) {
        A a = new A();
        a.test(4);
       int res = a.factorial(5);
        System.out.println("res="+res);
    }
}
class A{
    public void test(int n){
        if (n>2){
            test(n-1);
        }
            System.out.println("n=" + n);
        
    }
    public int factorial(int n){
        if (n==1){
            return 1;
        }else{
            return factorial(n-1) * n;
        }
    }
}
