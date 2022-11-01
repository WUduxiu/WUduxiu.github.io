package com.study.枚举enum_;

/**
 * @date 2022/10/6&22:51
 * 演示Enum类的各种方法
 */
public class EnumMethod {//用Enumeration03来演示
    public static void main(String[] args) {
        Season3 spring = Season3.SPRING;
        //toString()方法和name()方法类似，如果自己没有重写toString()方法的话
        System.out.println(spring.name());//name()方法枚举对象的常量名称
        System.out.println(spring.ordinal());//ordinal()方法输出的是该枚举对象的次序即位置  从0开始编号  可以用于作比较

        //用javap 反编译 class文件可以看到 Values方法，返回的是一个数组 Season3[]
        //Season3[]数组里面包含所有的枚举对象
        Season3[] values = Season3.values();
        System.out.println("使用增强for循环遍历数组：");
        for (Season3 season3 : values ){
    //增强for循环的流程：依次从values数组中取出数据，赋给season3对象，如果取出完毕就退出for循环 Season3则是数组类型
            System.out.println(season3);
        }
        //Value Of()：将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常
        /*
        1.根据输入的字符串，然后再到Season2的枚举对象中去查找是否存在这个常量名
        2.如果找到了就返回，如果没有找到就报错
         */
         Season3 spring1 = Season3.valueOf("SPRING");
        System.out.println(spring1==spring);//这两个对象是同一个对象 因为常量SPRING是静态的，所以返回的对象是相同的
        System.out.println(spring1);//输出的Season3里面重写的toString()方法
        /*
        compareTo()方法 用于判断俩个常量的顺序 俩个常量对象的编号相减(前面的-后面的)
        如果>0 则前面的在前面  如果<0 则后面的在前面
         */
        System.out.println(Season3.SPRING.compareTo(Season3.What));
        //在Season3里面 常量SPRING下标为0  What下标为2 相减结果为-2  常量SPRING在常量What之前
        System.out.println("*****************************");
        int [] arr = {1,2,3,4,5};
        for (int i : arr){//依次从int 类型的数组arr中取值赋给 i 再输出i
            System.out.print(i);
        }
        System.out.println("-----------------");
        System.out.println("普通的for循环输出");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }


    }

}
