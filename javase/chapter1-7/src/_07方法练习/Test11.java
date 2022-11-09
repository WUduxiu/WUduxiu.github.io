package _07方法练习;

public class Test11 {

    public static void main(String[] args) {
        System.out.println(method(method(10,20),10));//40
    }
    public static double method(double n1,double n2){

        return n1+n2;
    }

}
