package com.study.常用类.arrays类;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @date 2022/10/12&15:44
 */
public class 自定义排序AaarysSortCustom {
    public static void main(String[] args) {
        int [] arr = {1,-5,6,99,5,82};
        //bobble01(arr);
        bobble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                /*
                i1-i2 实现从小到大
                i2-i1 实现从大到小
                 */
                return i1-i2;//这里i1-i2的值会返回到 bobble02中 根据是>0 还是<0来确定排序顺序
            }
        });
        System.out.println(Arrays.toString(arr));

    }
    //使用冒泡排序 完成排序
    public static void bobble01(int [] arr){//从小到大
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void bobble02(int[] arr, Comparator c){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0;j<arr.length-1-i;j++){
                if (c.compare(arr[j],arr[j+1])>0){
                    /*
                    当上面是 i1 - i2的情况时
                    如果i1-i2>0 说明arr[j]>arr[j+1] 按照从小到大排序就交换位置
                    如果i1-i2<0 说明arr[j]<arr[j+1] 按照从小到大排序就不交换位置
                    所以当上面是 i1-i2是就完成从小到大的排序
                    ---------------------------------------------
                    当上面是 i2 - i1时
                    如果i2-i1>0  说明arr[j]<arr[j+1] 按照从小到大的顺序就不要交换，但是
                    因为(i2-i1>0)进入了if语句进行了交换，将大的值换到了前面
                    如果i2-i1<0  说明arr[j]>arr[j+1] 按照从小到大的顺序就要交换，
                    但是 因为(i2-i1<0)进入不了if语句就没能完成交换 ，保留大的值位置不变
                    这样就实现了当上面是i2 - i1时 就完成从大到小的排序
                     */
                    /*
                        这里根据这个方法来确定排序顺序 c.compare(arr[j],arr[j+1])
                        根据动态绑定机制，会到匿名内部类中实现 并且返回结果
                     */
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
