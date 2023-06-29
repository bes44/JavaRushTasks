package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        try (Scanner scanner = new Scanner(System.in)) {
//            System.out.print("Ведите путь: ");
//          List<String> list = Files.readAllLines (Paths.get("c:\\temp\\1.txt"));
            List<String> list = Files.readAllLines (Paths.get(scanner.nextLine()));
            int count = 1;

            for (String str : list) {

                if (count % 2 != 0) {
 //                   System.out.println("");
                    System.out.print(str+"\n");
                }
                count+=1;
             }
        }
    }
}

