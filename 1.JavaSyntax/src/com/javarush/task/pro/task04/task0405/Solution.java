package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
int y=0;
while (y < 10)
{
   int x = 0;
   while (x < 20)
{
if (((y < 1) || (y > 8)) ||(((x<1) || (x>18))) )
  System.out.print("Б");
else 
   System.out.print(" ");
   x++;
}
   System.out.println();
   y++;
}

    }
}
