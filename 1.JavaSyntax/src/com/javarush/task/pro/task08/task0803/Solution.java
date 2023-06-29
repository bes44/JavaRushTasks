package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //напишите тут ваш код
        int minim = ints[0]; 
         for (int i = 0; i < 10; i++) 
        {minim = Math.min(ints[i], minim);
        }   
        return minim;
    }

    public static int[] getArrayOfTenElements() {
        //напишите тут ваш код
        int[] gmy_array = new int[10];
        Scanner scanner = new Scanner(System.in);
       
        for (int i = 0; i < 10; i++) 
        {
            gmy_array[i] = scanner.nextInt();
     //       System.out.println(gmy_array[i]);
        }
        return gmy_array;
    }
}
