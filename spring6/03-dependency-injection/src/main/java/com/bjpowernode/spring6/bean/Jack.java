package com.bjpowernode.spring6.bean;

import java.util.Arrays;

/**
 * @date 2022/10/28&22:32
 */
public class Jack {
   private String [] hobbies;
   private Girls [] girls;

   public void setHobbies(String[] hobbies) {
      this.hobbies = hobbies;
   }

   public void setGirls(Girls[] girls) {
      this.girls = girls;
   }

   @Override
   public String toString() {
      return "Jack{" +
              "hobbies=" + Arrays.toString(hobbies) +
              ", girls=" + Arrays.toString(girls) +
              '}';
   }
}
