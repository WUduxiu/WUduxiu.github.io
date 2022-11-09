package _07方法练习;

public class Test03 {
    public static void main(String[] args) {
        Book book = new Book("笑傲江湖",50);
        book.info();//300
        book.updatePrice();
        book.info();//150

    }
}
class Book{
   int price;
   String name;
   public Book(String name,int price){
        this.name = name;//形参可以改变其属性
        this.price = price;
   }
   public void updatePrice(){
       if (this.price>150){
           this.price = 150;
       }else if(this.price>100){
           this.price = 100;
       }
   }
   public void info(){
       System.out.println("书籍的信息如下：书名="+name+"价格="+price);
   }
}
