package _07方法练习;

public class Test09 {
    public static void main(String[] args) {
        Music music = new Music("七里香",4);
        music.play();
        System.out.println(music.getInfo());
    }
}
class Music{
    String name;
    int times;
    public Music(String name,int times){
        this.name = name;
        this.times = times;
    }

    public void play(){
        System.out.println("音乐名"+this.name+"\t"+"时长"+this.times);
    }
    public String getInfo(){
        return "音乐名"+this.name+"\t"+"时长"+this.times;
    }
}
