package com.study.数据流data;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @date 2022/10/19&20:56
 * DataOutputStream:数据专属的流  也是个包装流
 * 这个流可以将数据连同数据的类型一并写入文件
 * 这个文件不是普通文档文件(用记事本打不开)
 */
public class DataOutputStreamTest01 {
    public static void main(String[] args) throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/write"));
        byte b = 2;
        short s = 1;
        int i = 3;
        long l = 4L;
        float f = 5.0f;
        double d = 6.0;
        boolean loop = false;
        char c = 'a';
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(loop);
        dos.writeChar(c);
        dos.flush();
        //关闭最外层
        dos.close();
    }
}
