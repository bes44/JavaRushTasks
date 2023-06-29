package com.javarush.task.task01.task0107;

/* 
Комментарии излишни
*/

public class Solution {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;
        int b=3, a=2, c=4,d=5,e=6,f=7,g=8,h=9;
        int z=(a+b+c+d+e+f+g+h)/8;
        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}
s65