package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Серега", 5.0);
        grades.put("Николай", 4.0);
        grades.put("Иван Петрович", 5.0);
        grades.put("Анюта", 3.0);
        grades.put("Анюта2", 5.0);
    }
}
