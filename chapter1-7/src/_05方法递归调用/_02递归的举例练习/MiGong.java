package _05方法递归调用._02递归的举例练习;

public class MiGong {
    public static void main(String[] args) {
        //1.先用二维数组创建迷宫
        //将1作为障碍物 0为道路
        int [][] map = new int[8][7];
        for(int i=0;i<7;i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for(int j=0;j<8;j++){
            map[j][0] = 1;
            map[j][6] = 1;
        }
        for(int j=0;j<3;j++){
            map[3][j] = 1;
        }
        map[2][2]=1;
        for (int i =0;i< map.length;i++){
            for(int j = 0;j<map[i].length;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println("");
        }
        /*
            findway方法专门找迷宫的路径
            找到就返回 true 否则返回 false
            map是二维数组 表示迷宫
            i，j为位置 起始位置为（1，1） 终始位置为（6，5）
            定义map数组的意义：
            0表示可以走通的路 1表示死路 2表示走成功路径 3表示走过但是走不通的路
            当map[6][5] = 2时表示 找到了通路 可以结束 否则继续寻找
            确定老鼠找路的方向 先 ↓ → ↑  ←

         */
        C c = new C();
        c.findway(map,1,1);
        System.out.println("通路为2");
        for (int i =0;i< map.length;i++){
            for(int j = 0;j<map[i].length;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
class  C {
    public boolean findway(int[][] map,int i,int j){
        if (map[6][5]==2){//当老鼠的最终位置到 （6，5）时则表示成功走出了迷宫 返回一个ture
            return true;
        }else{
            if (map[i][j]==0){
                map[i][j]=2;//假定当前位置为通路
                if (findway(map,i+1,j)){
                    return true;
                }
                else if (findway(map,i,j+1)){
                    return true;
                }
                else if (findway(map,i-1,j)){
                    return true;
                }
                else if (findway(map,i,j-1)){
                    return true;
                }
                else {
                    map[i][j] = 3;
                    return false;
                }
            }else{//当map[i][j] = 1，2，3时
                return false;
            }
        }

    }
}
