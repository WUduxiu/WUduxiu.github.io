package com.study.homework;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @date 2022/10/24&16:59
 */
public class Copy {
    public static void main(String[] args) {
        File src = new File("D:\\GBK");
        File des = new File("D:\\UTF");
        copy(src, des);
        System.out.println("copy successfully!");

    }

    public static void copy(File src, File des) {
        File[] fileArray = src.listFiles();
        if (fileArray != null) {
            for (File src1 : fileArray) {
                File des1 = new File(des, src1.getName());
                if (src1.isDirectory()) {
                    des1.mkdir();
                    copy(src1, des1);
                } else {
                    write(src1, des1);
                }
            }
        }
    }

    public static void write(File src, File des) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
         fis = new FileInputStream(src);
            fos = new FileOutputStream(des,true);
         InputStreamReader reader = new InputStreamReader(fis, Charset.forName("GBK"));
         BufferedReader br = new BufferedReader(reader);
         OutputStreamWriter writer = new OutputStreamWriter(fos);
         BufferedWriter bw = new BufferedWriter(writer);
         String s = null;
         while ((s=br.readLine())!=null){
         // System.out.println(s);
          bw.write(s+"\n");
          bw.flush();
         }
         br.close();
         bw.close();
         reader.close();
         writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
