package com.javarush.task.pro.task12.task1214;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Прощай, Паскаль
*/

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        //напишите тут ваш код
     int i =  programmingLanguages.indexOf("Pascal");  
    programmingLanguages.remove(i);
     
     for (i = 0; i < programmingLanguages.size(); i++) {
            System.out.println(String.format("%s — %d-й язык", programmingLanguages.get(i), (i + 1)));
        }
        System.out.println();   
    }
}
