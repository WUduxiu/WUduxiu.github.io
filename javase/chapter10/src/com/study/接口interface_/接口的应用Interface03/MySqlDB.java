package com.study.接口interface_.接口的应用Interface03;

public class MySqlDB implements InterfaceDB{
    @Override
    public void connect() {
        System.out.println("连接MySql");
    }

    @Override
    public void close() {
        System.out.println("关闭MySql");
    }
}
