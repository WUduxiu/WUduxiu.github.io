package _04面向对象编程;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class _05成员方法练习 {
    public static void main(String[] args) {
        int [][] map = {{0,0,1},{1,1,1,},{1,1,3}};
//        //传统的解决方式：直接使用for循环
//        for(int i=0;i<map.length;i++){
//            for (int n=0;n<map[i].length;n++){
//                System.out.print(map[i][n]+"\t");
//            }
//            System.out.println(" ");
//        }
        method m = new method();
        m.arr(map);
        m.arr(map);
       int resarr[] = m.getSumAndSub(10,5);
        System.out.println("俩数相加的和为"+resarr[0]);
        System.out.println("俩数相见的差为"+resarr[1]);
    }
}
    class method{
        public void arr(int[][] map){
            //传统的解决方式：直接使用for循环
            for(int i=0;i<map.length;i++){
                for (int n=0;n<map[i].length;n++){
                    System.out.print(map[i][n]+"\t");
                }
                System.out.println(" ");
            }
        }
        public int[] getSumAndSub (int a,int b){
            int[] resArr = new int[2];
            resArr[0] = a+b;
            resArr[1] = a-b;
            return resArr;
        }
    }

