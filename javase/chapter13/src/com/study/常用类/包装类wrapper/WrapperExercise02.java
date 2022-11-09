package com.study.常用类.包装类wrapper;

/**
 * @date 2022/10/10&8:59
 */
public class WrapperExercise02 {
    public static void method(){
        Integer i = new Integer(2);//手动装箱
        Integer j = new Integer(1);//手动装箱
        System.out.println(i==j);//f  有俩个new 就是创建了俩个对象
        System.out.println(i.equals(j));//t
        Integer m = 1;//自动拆箱   int m = Integer.valueOf(1);
        Integer n = 1;//自动拆箱   int n = Integer.valueOf(1);
        /*
                int m = Integer.valueOf(1);int n = Integer.valueOf(1);valueOf()
                valueOf()做了判断
        public static Integer valueOf(int i) {  判断传入i的值属于那个范围
             if (i >= IntegerCache.low(最小值:-128) && i <= IntegerCache.high(最大值:127))
             return IntegerCache.cache[i + (-IntegerCache.low)];
             return new Integer(i);
              如果传入的i  -127<=i<=127 就返回同一个数组里面的元素IntegerCache.cache[i + (-IntegerCache.low)]
              如果传入的i  不在-128~127这个区间 就返回一个新对象 return new Integer(i);
    }
         */
        System.out.println(m==n);//t
        //------------------------------------------------------------
        Integer x = 128;
        Integer y = 128;
        System.out.println(x==y);
    }
    public static void main(String[] args) {
        method();
    }
}
