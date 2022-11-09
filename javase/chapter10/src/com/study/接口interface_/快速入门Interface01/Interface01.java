package com.study.接口interface_.快速入门Interface01;

public class Interface01 {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.work(phone);
        computer.work(camera);
    }
}
