package com.javarush.task.pro.task11.task1101;

/* 
Солнечная система — наш дом
*/

public class Solution {

    public static void main(String[] args) {

        System.out.println("Человечество живет в Солнечной системе.");
 //       System.out.println("Ее возраст около 4568200000 лет.");
        System.out.printf("Ее возраст около %d лет.\n", SolarSystem.age);
//        System.out.println("В Солнечной системе 8 известных планет.");
        System.out.printf("В Солнечной системе %d известных планет.\n",SolarSystem.planetsCount);
//        System.out.println("Как и большинство звездных систем, состоит из 1 звезды.");
        System.out.printf("Как и большинство звездных систем, состоит из %d звезды.\n",SolarSystem.starsCount);
//        System.out.println("Звезды по имени Солнце.");
        System.out.printf("Звезды по имени %s.\n",SolarSystem.starName);
//        System.out.println("Расстояние к центру галактики составляет 27170 световых лет.");
        System.out.printf("Расстояние к центру галактики составляет %d световых лет.\n",SolarSystem.galacticCenterDistance);
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");

    }
}
