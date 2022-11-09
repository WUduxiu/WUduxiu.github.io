package com.study.数据流data;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @date 2022/10/19&21:08
 * DataInputStream:
 *  DataInputStream写的文件，只能用DataInputStream去读，并且读的时候需要提前知道顺序 规则
 *  读的顺序和写的顺序一样，才可以正常取出数据
 */
public class DataInputStreamTest01 {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(new FileInputStream("src/write"));
        byte b = dis.readByte();
        short s = dis.readShort();
        int i = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();
        boolean loop = dis.readBoolean();
        char c = dis.readChar();
        System.out.println(b+100);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(loop);
        System.out.println(c);
        dis.close();
    }
}
