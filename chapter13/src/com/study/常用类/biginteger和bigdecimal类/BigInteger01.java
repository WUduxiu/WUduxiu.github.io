package com.study.常用类.biginteger和bigdecimal类;

import java.math.BigInteger;

/**
 * @date 2022/10/12&19:25
 */
public class BigInteger01 {
    public BigInteger01(String s) {
    }

    public static void main(String[] args) {
        //处理很大的整数时，可以使用BigInteger
        BigInteger bigInteger = new BigInteger("999999999999999999999999999");
        BigInteger bigIntegeradd = new BigInteger("1000");
        BigInteger bigIntegersub = new BigInteger("10000");
        BigInteger bigIntegermul = new BigInteger("5");
        BigInteger bigIntegerdiv = new BigInteger("5");
        System.out.println(bigInteger);
        //使用BigInteger里面的方法进行计算，
        // 但是要先创建一个BigInteger类
        System.out.println(bigInteger.add(bigIntegeradd));//加
        System.out.println(bigInteger.subtract(bigIntegersub));//减
        System.out.println(bigInteger.multiply(bigIntegermul));//乘
        System.out.println(bigInteger.divide(bigIntegerdiv));//除
        /*
        但是不能直接对bigInteger进行 加减乘除运算
        
         */
    }
}
