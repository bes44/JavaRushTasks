package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
Scanner console = new Scanner(System.in);
int ss=0;
boolean isExit = false;
while (!isExit)
{
   String s = console.next();
   isExit = s.equals("ENTER");
   if (!isExit)
   {
   ss=ss+Integer.parseInt (s);
   }

   }
 System.out.println (ss); 
    }
}