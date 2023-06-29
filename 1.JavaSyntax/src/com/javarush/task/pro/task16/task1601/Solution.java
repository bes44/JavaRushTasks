package com.javarush.task.pro.task16.task1601;

import java.util.Date;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date ("Apr 25 00:00:01 1982");

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код

        switch (date.getDay()) {
          case 0: return "Воскресенье";
          case 1: return "Понедельник";
          case 2: return "Вторник";
          case 3: return"Среда";
          case 4: return "Четверг";
          case 5: return "Пятница";
          case 6: return "Суббота";
          default: return "";
       }
    }
}
/*
public class Solution {

//    static Date birthDate = new Date(120, Calendar.MARCH, 17);
static Date birthDate = new Date("Apr 25 00:00:01 1982");
public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        String result = "";
        int day = date.getDay();
        switch (day) {
            case 0:
                return "воскресенье";
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
        }
        return result;
    }
}

*/