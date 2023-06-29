package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        strings = new String[6];
        String nullstring;
        for (int i = 0; i < 6; i++)
        {
            strings[i] = console.nextLine();
        }
         
        for (int i = 0; i < 6; i++)
        {
           nullstring = strings[i];
           for (int j = 1; j < 6; j++) 
            { 
              if ((nullstring != null) && (strings[j] != null))
             { 
               if ( (nullstring.equals(strings[j]) && (i != j)))
             {
                 strings[j] = null;
                 strings[i] = null;
              }
              }
            }
        }
    
        for (int i = 0; i < 6; i++) 
                 {
                    System.out.print(strings[i] + ", ");   
                 }
}
}