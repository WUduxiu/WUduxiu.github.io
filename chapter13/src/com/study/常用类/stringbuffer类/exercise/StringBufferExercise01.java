package com.study.常用类.stringbuffer类.exercise;

/**
 * @date 2022/10/11&21:12
 */
public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        /*
         sb.append(str);底层源码：
           private AbstractStringBuilder appendNull() {
                int c = count;
                ensureCapacityInternal(c + 4);
                final char[] value = this.value;
                value[c++] = 'n';
                value[c++] = 'u';
                value[c++] = 'l';
                value[c++] = 'l';
                count = c;
                return this;
    }           实际上就是返回了一个字符串 null
         */
        System.out.println(sb.length());
        System.out.println(sb);
        StringBuffer sb1 = null;
        try {
            sb1 = new StringBuffer(str);
        } catch (Exception e) {
            System.out.println("发生空指针异常"+e.getMessage());
        }
        /*
        StringBuffer(String)构造器底层代码：
        public StringBuffer(String str) {
        super(str.length() + 16);  相当于null.length()+16 会发生空指针异常 NullPointerException
        append(str);
    }
         */
        //抛出了异常以后就执行  append(str)和上面结果一样
        System.out.println(sb1);
    }
}
