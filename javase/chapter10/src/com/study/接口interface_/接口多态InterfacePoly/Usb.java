package com.study.接口interface_.接口多态InterfacePoly;

public interface Usb {
    void work();
}
class Phone implements Usb{

    @Override
    public void work() {
        System.out.println("手机开始工作");
    }
    public void call(){
        System.out.println("手机可以打电话");
    }
}
class Camera implements Usb{

    @Override
    public void work() {
        System.out.println("相机开始工作");
    }
}
class Test{
    public static void main(String[] args) {
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone();
        usbs[1] = new Camera();
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            if (usbs[i] instanceof Phone){
                ((Phone) usbs[i]).call();
            }
        }
    }
}
