package com.javarush.task.pro.task04.task0413;

/* 
Рисуем треугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
for (int i = 0; i <= 10; i++)
{
   int starCount = 10 - (10 - i);
   for (int j = 0; j < starCount; j++)
      System.out.print("8");
   if (i != 0) 
   System.out.println();
}
    }
}