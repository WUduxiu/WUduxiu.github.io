package _05方法递归调用._02递归的举例练习;

public class HanoiTower {
    public static void main(String[] args) {
        Tower tower = new Tower();
        tower.move(2,'A','B','C');
    }
}
class Tower {
    public void move(int num,char a,char b,char c){
        if (num==1){
            System.out.println(a+"→"+c);
        }else{
            move(num-1,a,c,b);
            System.out.println(a+"→"+c);
            move(num-1,b,a,c);
        }
    }
}
