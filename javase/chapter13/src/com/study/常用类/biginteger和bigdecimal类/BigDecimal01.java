package com.study.常用类.biginteger和bigdecimal类;

import java.math.BigDecimal;

/**
 * @date 2022/10/12&19:50
 */
public class BigDecimal01 {
    public static void main(String[] args) {
//        double d = 15.9646322656662623231;
//        System.out.println(d);//会进行自动的缩减  经度不够
        BigDecimal bigDecimal = new BigDecimal("50.646466446444444444444444440");
        System.out.println(bigDecimal);
        //对其运算也需要使用方法
        BigDecimal bigDecimaladd = new BigDecimal("5.3326655");
        BigDecimal bigDecimalsub = new BigDecimal("5.3166");
        BigDecimal bigDecimalmup = new BigDecimal("55.24444");
        BigDecimal bigDecimaldiv = new BigDecimal("50.588888");
        System.out.println(bigDecimal.add(bigDecimaladd));//加
        System.out.println(bigDecimal.subtract(bigDecimalsub));//减
        System.out.println(bigDecimal.multiply(bigDecimalmup));//乘
        /*
        除法可能抛出一个异常
        ArithmeticException：Non-terminating decimal expansion 无限循环小数
        可以在调用divide方法时，指定经度 BigDecimal.ROUND_CEILING即可
        如果有无限的循环小数就会保留 分子的经度值
         */
        System.out.println(bigDecimal.divide(bigDecimaldiv,BigDecimal.ROUND_DOWN));//除

    }
}
