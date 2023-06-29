package com.javarush.task.pro.task15.task1520;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Перемещение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //напишите тут ваш код
        try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) {
            for (Path path : files) {
                // System.out.println(path);
                if ( Files.isRegularFile(path) ) {
                    Path copyto = targetDirectory.resolve(path.getFileName());
                    // System.out.println(copyto);
                    Files.move(path, copyto);
                }
            }
        }
        catch (Exception e) { }
    }
}
