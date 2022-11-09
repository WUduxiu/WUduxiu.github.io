package com.study.homework;

/**
 * @date 2022/10/8&10:23
 */
public class Test01 {
 public static void main(String[] args) {
  Car c = new Car();
  Car c1 = new Car(100);
  System.out.println(c);//9 red
  System.out.println(c1);//100 red

 }
}
class Car{
 double price = 10;
 static String color = "white";//静态代码只随着类的加载而加载一次
 public String toString(){
  return price + "\t" + color;
 }

 public Car() {
  this.price = 9;
  this.color = "red";
 }
 public Car(double price) {
  this.price = price;
 }
}
