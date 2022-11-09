package _07方法练习;

public class Test01 {
    public static void main(String[] args) {
        A01 a = new A01();
        double [] arr = {1};
        Double res = a.max(arr);
        if (res!=null){
            System.out.println("该数组的最大值为"+a.max(arr));
        }else {
            System.out.println("你输入的数组有问题，数组arr不能为null，或者为空");
        }

    }
}
class A01{
    public Double max (double[] arr){//Double 是一个封装好了的double对象 返回值就不一定要是double类型的值；
        if(arr!=null&&arr.length>0){
            double max = arr[0];
            for(int i=1;i<arr.length;i++){//i=1;表示从第二个开始比较
                if (max < arr[i]){
                    max = arr[i];
                }
            }
            return max;
        }else {
            return null;//返回null 可以避免干扰正确的返回结果
        }
    }
}
