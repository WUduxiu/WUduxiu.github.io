package com.study.homework;

/**
 * @date 2022/10/8&19:34
 */
public class Test07 {
    public static void main(String[] args) {
        Car1 car1 = new Car1(12);
        car1.getAir().flow();
        Car1 car2 = new Car1(-1);
        car2.getAir().flow();
        Car1 car3 = new Car1(50);
        car3.getAir().flow();

    }
}
class Car1{
    private double temperature;

    public Car1(double temperature) {
        this.temperature = temperature;
//        Air air = new Air();
//        air.flow();
    }


    class Air{
        public void flow(){
            if (Car1.this.temperature>40){
                System.out.println("气温高于40度吹冷风");
            }else if (Car1.this.temperature<0){
                System.out.println("气温低于0度吹热风");
            }else {
                System.out.println("气温正常关闭空调");
            }
        }
    }
    //
    public Air getAir(){
        return new Air();
    }
}
