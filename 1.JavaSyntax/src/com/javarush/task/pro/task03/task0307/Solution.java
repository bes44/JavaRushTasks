package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
         Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        if ((number1 < 20 ) || (number1 > 60 ))
        {
            System.out.println("можно не работать");
        } else
            System.out.println("Нужно работать");
     
    }
}
