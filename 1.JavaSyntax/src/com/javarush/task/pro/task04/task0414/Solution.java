package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

String s;
Scanner console = new Scanner(System.in);
   s = console.nextLine();
   int x = console.nextInt();
do {

   System.out.println(s); 
   if ((x <=0 ) || (x >= 5))
   break;
   x--;
}
while ( x > 0 );
}
}

