package com.study.异常exception_.异常处理try_catch.exercise;

/**
 * @date 2022/10/9&16:20
 */
public class TryCatchExercise03 {
    public static int method() {
        int i = 1;
        try {
            ++i;
            //System.out.println(++i);  这里可以体现前++(先赋值，后自增)  和后++(先自增，后赋值)的区别
            String[] names = names = new String[3];
            if (names[1].equals("tom")) {//NullPointerException空指针异常
                System.out.println(names[1]);
            } else {
                names[3] = "hello";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return ++i; //此时并不会马上返回 i=3，而是底层先用 一个临时变量temp保存i的值 即temp=3
                        //执行完finally代码块里的语句后，再回头来return i的值
        } finally {
             ++i;
            System.out.println("i="+i);
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
