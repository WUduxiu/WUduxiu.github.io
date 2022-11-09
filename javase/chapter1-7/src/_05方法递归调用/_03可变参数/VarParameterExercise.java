package _05方法递归调用._03可变参数;



public class VarParameterExercise {
    public static void main(String[] args) {
        Method method = new Method();
        System.out.println(method.showScore("小明",20.0,5.0,3.6));
        int a = 1;
        long b = 2;
        System.out.println();




    }
}
class Method{
    public String  showScore(String name,double ...score){
        double add = 0;
        for (int i =0;i<score.length;i++){
            add = add + score[i];
        }
        return name+"同学有"+score.length+"门，其总成绩为"+add;
    }
}
