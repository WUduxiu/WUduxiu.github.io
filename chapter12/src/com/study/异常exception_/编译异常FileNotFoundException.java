package com.study.异常exception_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @date 2022/10/7&20:13
 */
public class 编译异常FileNotFoundException {
    public static void main(String[] args) {
        FileInputStream fis;
        try {
            fis =  new FileInputStream("C:\\Users\\Hasee\\Desktop");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
