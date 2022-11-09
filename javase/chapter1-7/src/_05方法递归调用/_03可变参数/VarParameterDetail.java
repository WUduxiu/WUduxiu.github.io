package _05方法递归调用._03可变参数;

public class VarParameterDetail {
    public static void main(String[] args) {
//java允许将同一个类有多个同名 同功能  但参数个数不同的的方法，封装成一个方法 通过可变参数实现
        //2.可变参数的本质就是数组
        //4.一个形参列表只能出现一个可变参数
        A a = new A();
        int sum =   a.add(6,1,8,8);//实参是这里传入的数据
        System.out.println("和为"+sum);
        B b = new B();
        int [] arr = {1,2,3,4};//1.可变参数的实参可以是数组
        b.arr(5,arr);

    }
}
class A {
    public int add(int ...nums){//形参就是定义的数据
        System.out.println("接收的个数"+nums.length);
        int res = 0;
        for(int i =0;i<nums.length;i++){
            res = res+nums[i];
        }
        return res;
    }
}
class B{
    public void arr(int a,int ...b){//3.可变参数可以和普通类型的参数一起放在形参列表，但是必须保证可变参数在最后一个
        System.out.println("长度为"+b.length);

    }
}
