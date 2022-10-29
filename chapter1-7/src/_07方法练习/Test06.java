package _07方法练习;

public class Test06 {
    public static void main(String[] args) {
        Cale cale = new Cale(8,0);
        System.out.println(cale.add());
        System.out.println(cale.subtract());
        System.out.println(cale.multiply());
        Double res = cale.except();
        if (res!=null){
            System.out.println(res);
        }else {
            System.out.println("num2不能为0");
        }
        }

}
class Cale{
    double num1;
    double num2;
    public Cale(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double add(){//加
        return num1+num2;
    }
    public double subtract(){//减
        return num1-num2;
    }
    public double multiply(){//乘
        return num1*num2;
    }
    public Double except(){//除
        if(num2!=0){
            return num1/num2;
        }else {
            return null;
        }


    }
}
