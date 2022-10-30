package com.study.接口interface_.快速入门Interface02;

public class Interface02 implements Interface{
    @Override
    public void hi() {

    }

    @Override
    public void hi2() {
        Interface.super.hi2();
    }
}
