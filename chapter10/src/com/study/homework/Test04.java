package com.study.homework;

import com.study.接口interface_.快速入门Interface01.Computer;

/**
 * @date 2022/10/8&10:51
 */
public class Test04 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },10,8);
        cellPhone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1*n2;
            }
        },10,8);
        /*
        new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        }, 这些就是一个匿名内部类的对象，此时的运行类型为匿名内部类，编译类型是接口
        (,)是和下面传统方法一样 后面添加俩个传入的参数


         */
        //传统方法
        Test test = new Test();
          /*
          传统方法：
         cellPhone.testWork()调用该方法里面需要传入一个实现了ICalculate接口的对象
         和俩个需要计算的参数
         然后根据动态绑定机制，因为此时test的运行类型为Test()，找到Test类中的work方法
         work()方法中有具体的运算 然后返回结果 用result接收结果并输出
         */
        cellPhone.testWork(test,10,20);
    }
}
interface ICalculate{
    double work(double n1, double n2);//定义work方法并要求传入俩个参数
}
class CellPhone{
    //定义方法testWork测试计算功能，调用计算接口的work方法
    /*
    要求调用CellPhone对象的testWork方法，使用上匿名内部类
    如何使用匿名内部类：传一个实现了该接口(ICalculate iCalculate)的匿名内部类
    在匿名内部类中实现具体的work()方法，完成不同的计算任务

     */
   public void testWork(ICalculate iCalculate,double n1,double n2){
        double result = iCalculate.work(n1,n2);//动态绑定机制，根据运行类型来判断
       System.out.println("运算的结果="+result);
   }
}
class Test implements ICalculate{
    @Override
    public double work(double n1, double n2) {
        return n1+n2;
    }
}
