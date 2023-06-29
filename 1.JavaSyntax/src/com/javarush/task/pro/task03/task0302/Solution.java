package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        //напишите тут ваш код
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    int Age = scanner.nextInt();
    if (Age >= 18) 
{    
    if (Age <= 28)
    {
        System.out.println(name + militaryCommissar); 
    }   
    }
}
        
    }
