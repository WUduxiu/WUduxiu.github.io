package _07方法练习;

public class Test02 {
    public static void main(String[] args) {
        String [] arr = {"小红","小明","jack","张三"};
        A02 a = new A02();
        int res = a.find(arr,"jack");
        System.out.println(res);

    }
}
class A02{
    public int find (String [] arr,String find){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入要查找的元素");
//        String find = scanner.next();
        for(int i=0;i< arr.length;i++){
            if (find.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }
}
