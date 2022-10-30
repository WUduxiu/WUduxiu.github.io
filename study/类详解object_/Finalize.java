package com.study.类详解object_;

import com.study.pkg.C;

public class Finalize {
    public static void main(String[] args) {
        Car car = new Car("123");
         car = new Car();


        //
        // bwm = null;//将对象置空，此时Car对象就是一个垃圾，垃圾回收器会销毁这个对象
        //在销毁前会调用对象的finalize方法
        //此时就可以重写finalize方法，在其中加入自己的业务逻辑代码 例如释放资源：数据库连接，打开文件
        //如果不重写finalize方法，就会调用Object类的 finalize方法，即默认处理
        int sum =0;
        for (int i = 0; i < 5000000; i++) {
            Car bwm = new Car("宝马");
        }
        System.gc();//运行垃圾回收器  该方法不会阻塞程旭运行
        System.out.println("程序退出");

    }
}

class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("释放了资源"+this);
    }

    public Car() {
    }
}
