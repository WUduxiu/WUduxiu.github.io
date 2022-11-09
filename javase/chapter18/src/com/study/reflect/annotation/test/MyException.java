package com.study.reflect.annotation.test;

/**
 * @date 2022/10/23&20:38
 */
public class MyException extends RuntimeException{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
