package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
    Scanner console = new Scanner(System.in);
      Double rad = console.nextDouble();
     if (rad > 0)     
     System.out.println ((int)(3.14 * rad * rad) );

    }
}