package com.study.常用类.math;

/**
 * @date 2022/10/11&23:08
 */
public class MathMethod {
    public static void main(String[] args) {
        //Math的常用方法(静态方法)
        //1.abs 求绝对值
        int abs  = Math.abs(-9);
        System.out.println(abs);//9
        //2.pow 求幂
        double pow = Math.pow(2,4);
        System.out.println(pow);//2*2*2*2=16.0 2的四次方
        //3. ceil 向上取整，返回>=该参数的最小整数
        double ceil = Math.ceil(2.2);
        System.out.println(ceil);//3.0
        //4.floor 向下取整，返回<=该参数的最小整数
        double floor = Math.floor(-5.3);
        System.out.println(floor);//-6.0
        //5. round 四舍五入
        double round = Math.round(-5.1);
        System.out.println(round);//-5
        //6. 求开方
        double sqrt = Math.sqrt(16);
        System.out.println(sqrt);//4
        //7. random 求随机数
        /*
        random返回的是 0<= x < 1 之间的随机小数
         */
        /*
        返回 a-b的整数
        (int) (a + Math.random()*(b-a+1))
         */
        for (int i = 0; i < 10; i++) {
            System.out.println((int) (2+Math.random()*6));
        }
        //8 max,min 返回最大值，最小值
        int min = Math.min(10,2);
        int max = Math.max(5,66);
        System.out.println("最小值"+min);
        System.out.println("最大值"+max);

    }
}
