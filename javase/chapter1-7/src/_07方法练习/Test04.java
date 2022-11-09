package _07方法练习;

public class Test04 {
    public static void main(String[] args) {
        A03 a = new A03();
        int [] arr = {1,2,3};
        int[] arry = new int[3];
        System.arraycopy(arr,0,arry,0,3);
        for (int i = 0; i <arry.length ; i++) {
            System.out.println(arry[i]);
        }
        int[] newarr =  a.copy(arr);
        for (int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]);
        }
    }
}
class A03{
    int [] arr;
    public int[] copy(int[] arr){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入旧的数组长度");
//        int  length = scanner.nextInt();
//        int [] oldarr = new int[length];
//        for (int i=0;i<length;i++){
//            System.out.println("请输入第"+(i+1)+"个元素");
//            int num = scanner.nextInt();
//            oldarr[i] =num;
//        }
//        int [] newarr = new int[length];
//        for (int i=0;i<newarr.length;i++){
//            newarr[i]=oldarr[i];
//        }
//        for (int i=0;i<newarr.length;i++){
//            System.out.print("新数组:"+newarr[i]);
//        }
        int [] newarr = new int[arr.length];
        for(int i=0;i<newarr.length;i++){
            newarr[i] = arr[i];
        }

        return newarr;
    }
}
