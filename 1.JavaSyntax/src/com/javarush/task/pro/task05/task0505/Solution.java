package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
     Scanner console = new Scanner(System.in);
     int n=console.nextInt();
     if  ( n > 0) 
     {   int[] array = new int[n];
         for (int i = 0; i < n; i++)
         {
         array[i] = console.nextInt();
         }
     
     if ( (n %2 ) == 0)
     {
       for (int i = n-1; i >= 0; i--) {
           System.out.println(array[i]);  
        }
     }
    else
        {
        for (int i = 0; i < n; i++) {
         System.out.println(array[i]);   
         }
        }
     }

}
}

