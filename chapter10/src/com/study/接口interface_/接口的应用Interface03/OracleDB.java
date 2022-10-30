package com.study.接口interface_.接口的应用Interface03;

public class OracleDB implements InterfaceDB{
    @Override
    public void connect() {
        System.out.println("连接Oracle");
    }

    @Override
    public void close() {
        System.out.println("关闭Oracle");
    }
}
