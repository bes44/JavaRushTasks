package com.javarush.task.pro.task08.task0814;

/* 
Флаги
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {
        //напишите тут ваш код
        number = number | (1 << flagPos);
        return number;
    }

    public static int resetFlag(int number, int flagPos) {
        //напишите тут ваш код
        number = number & ~(1 << flagPos);
        return number;
    }

    public static boolean checkFlag(int number, int flagPos) {
        //напишите тут ваш код
        if ((number & (1 << flagPos)) == (1 << flagPos)) return true;
        return false;
    }
}
