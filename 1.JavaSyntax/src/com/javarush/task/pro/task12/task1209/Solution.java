package com.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Бухгалтерия
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        //напишите тут ваш код

   if (waitingEmployees.contains(name) && (name !=null) ) 
       {
//           alreadyGotSalaryEmployees.add(name);
//           waitingEmployees.remove(name);
/*     if (waitingEmployees.contains(name) && (name !=null) )
            IntStream.range(0, waitingEmployees.size()).forEach(i -> {
                alreadyGotSalaryEmployees.add(name);
                waitingEmployees.set(i, null);
            });
*/


        for (int i = 0; i<waitingEmployees.size();i++)
        {
            alreadyGotSalaryEmployees.add(name);
            waitingEmployees.set(i, null);
        }
        
        }

    }
}
