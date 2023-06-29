package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
    int i=0, s=0;
    while (i<100)
    {
      i++; 
      if ((i%3)!=0)
      {
        s=s+i;
   //   System.out.println (i+"   "+s);
        
      }
        else 
          continue;
    }
    System.out.println (s);
    }
}