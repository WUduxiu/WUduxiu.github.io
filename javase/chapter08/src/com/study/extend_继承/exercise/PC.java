package com.study.extend_继承.exercise;

public class PC extends Computer {
   private String brand;
    //idea根据继承的规则，自动把构造器的调用写好
    //继承的基本思想，父类的构造器完成父类的属性初始化
    //子类的构造器完成子类的初始化
    public PC(String CPU, int memory, int disk, String brand) {
        super(CPU, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println("信息如下");
        System.out.println(getDetails()+"brand="+brand);
    }
}
