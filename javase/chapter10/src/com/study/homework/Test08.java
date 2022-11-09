package com.study.homework;



/**
 * @date 2022/10/8&21:38
 */
public class Test08 {
    public static void main(String[] args) {
        Color red = Color.RED;
        Color black = Color.BLACK;
        red.show();
        switch (black){
            case RED:
                System.out.println("匹配到红色");
            break;
            case BLUE:
                System.out.println("匹配到蓝色");
            break;
            case YELLOW:
                System.out.println("匹配到黄色");
            break;
            case GREEN:
                System.out.println("匹配到绿色");
            break;
            case BLACK:
                System.out.println("匹配到黑色");
            break;
            default:
                System.out.println("没有匹配到颜色");
        }
    }
}
enum Color implements I{
    RED(225,0,0),BLUE(0,0,255),BLACK(0,0,0),
    YELLOW(255,255,0),GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color(int redValue, int greenValue, int blueValue) {//默认的构造器是private
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }
    @Override
    public String toString() {
        return
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue
                ;
    }

    @Override
    public void show() {
        System.out.println(toString());
    }
}
interface I{
     void show();
}
