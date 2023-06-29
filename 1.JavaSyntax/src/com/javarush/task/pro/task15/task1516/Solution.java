package com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args)
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String str;
        try {
            while (flag) {
                str = scanner.nextLine();
                if (str != null) {
                    if (Files.exists(Path.of(str))) {
                        if (Files.isDirectory(Path.of(str))) {
                            System.out.println(str + THIS_IS_DIR);
                        } else if (Files.isRegularFile(Path.of(str))) {
                            System.out.println(str + THIS_IS_FILE);
                        } else {
                            flag = false;
                        }
                    } else flag = false;
                } else flag = false;
            }
        }
        catch (Exception e) { }
    }
}

