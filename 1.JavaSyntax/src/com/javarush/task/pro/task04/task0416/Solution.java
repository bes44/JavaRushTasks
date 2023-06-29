package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Деление целых чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
     Scanner console = new Scanner(System.in);
     int x = console.nextInt(), y = console.nextInt();
     if ((x>0) && (y>0))
     {
     System.out.println((double)(x/(double)y));
     }
     
    }
}