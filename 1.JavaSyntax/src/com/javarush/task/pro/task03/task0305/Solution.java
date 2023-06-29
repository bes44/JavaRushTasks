package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    private static boolean isHigh;
    private static boolean isLow;
    
    public static void main(String[] args) {
        //напишите тут ваш код
     Scanner console = new Scanner(System.in);
      int a = console.nextInt();  
      int b = console.nextInt();  
      int c = console.nextInt();  
      if ((a==b) && (b==c) ){
        System.out.print(a +" "+ b + " "+c);
         }
        else if (a==b) {
            System.out.print(a + " " + b);
            }
        else if (b==c) {
             System.out.print(b + " " + c);
        }    
        else if (a==c) {
             System.out.print(a + " " + c);
                }
    
        }   
    }
