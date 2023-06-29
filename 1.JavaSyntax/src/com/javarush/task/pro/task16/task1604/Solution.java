package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1982, Calendar.APRIL, 25);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишите тут ваш код
        switch (birthDate.get(Calendar.DAY_OF_WEEK))
        {
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
