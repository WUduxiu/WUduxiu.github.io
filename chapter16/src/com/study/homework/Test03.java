package com.study.homework;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @date 2022/10/24&16:28
 */
public class Test03 {
    public static void main(String[] args) throws Exception {
        InputStreamReader reader = new InputStreamReader(new FileInputStream("D:\\JavaTest\\_01转义字符.java"), Charset.forName("GBK"));
        BufferedReader br = new BufferedReader(reader);
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/write",true));
        String s = null;
        int i = 0;
        while ((s=br.readLine())!=null){
            System.out.println(s);
            bw.write(s+"\n");
            bw.flush();
        }
        bw.close();
        br.close();
        reader.close();
    }
}
