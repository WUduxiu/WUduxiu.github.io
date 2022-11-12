package com.bjpowernode.spring6.bean;

/**
 * @date 2022/10/28&23:22
 */
public class SetNull {
   private String name;
   private String hobby;

   public void setName(String name) {
      this.name = name;
   }

   public void setHobby(String hobby) {
      this.hobby = hobby;
   }

   @Override
   public String toString() {
      return "SetNull{" +
              "name='" + name + '\'' +
              ", hobby='" + hobby + '\'' +
              '}';
   }
}
