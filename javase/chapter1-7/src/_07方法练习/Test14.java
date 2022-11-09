package _07方法练习;

public class Test14 {
    public static void main(String[] args) {
        Tom t = new Tom();
        //int a =(int)(Math.random()*(a))  相当于是随机出[0,a)
        //int computer = (int) (Math.random()*(3)); 随机0-2
       // t.game(5,2);
        String c = "123";
        System.out.println(c.toString());
    }
}
class Tom{

    //0表示石头  1表示剪刀  2表示布
    public void game(int n1,int n2){//computer是产生的随机数  n1是Tom总共游戏的次数  n2是Tom要出的
        int num =0;
        for (int i=0;i<n1;i++){
            int computer = (int) (Math.random()*(3));
            if (computer==0&&n2==2){
                String c1 = "电脑出了石头";
                String t1 = "Tom出了布";
                System.out.println(c1+t1+"Tom赢了");
                num++;
            }else if (computer==1&&n2==0){
                num++;
            }else if (computer==2&&n2==1){
                num++;
            }
        }


        System.out.println("总共进行了"+n1+"次游戏，Tom赢了"+num+"局游戏，输了"+(n1-num)+"局游戏");
    }


}
