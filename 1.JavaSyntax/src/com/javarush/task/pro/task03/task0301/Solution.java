package com.javarush.task.pro.task03.task0301;

import java.util.Scanner;

/* 
Тепло или холодно
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    if (t >= 0) 
    {
    System.out.println ("на улице тепло"); 
    }
   else 
   {
     System.out.println ("на улице холодно");   
   }
    }
}
