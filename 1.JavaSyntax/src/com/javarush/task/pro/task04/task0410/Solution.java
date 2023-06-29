package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/*
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int min = Integer.MAX_VALUE, x=min, min2=min;
        while (console.hasNextInt())
        {
            x = console.nextInt();
            if ((x < min2) && (min < min2) && (min !=x))
            min2 = x;        
            if (x < min)
            {
             min2 = min;    
             min = x;
            }

         }
     System.out.println(min2);
}
   
}