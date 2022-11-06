package com.study.缓冲流bufferedreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * @date 2022/10/19&20:08
 */
public class BufferedReaderTest02 {
    public static void main(String[] args) throws Exception {
        //字节流
       // FileInputStream in = new FileInputStream("src/temp");
        //通过转换流(InputStreamReader将字节流转为Reader字符流)
       // InputStreamReader reader = new InputStreamReader(in);//转换流
        //这个构造方法只能传一个字符流，不能传字节流
      //  BufferedReader br = new BufferedReader(reader);
        //合并写法
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/temp")));
        String line = null;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        //关闭最外层
        br.close();
    }
}
