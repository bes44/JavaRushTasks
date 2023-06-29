package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) {
            return true;
        }
        if ((ob == null) || (getClass() != ob.getClass())) {
            return false;
        }
 //       if (this.price == null)  
 //       return false;
        
        Iphone iphone = (Iphone) ob;
        return price == iphone.price &&
                Objects.equals(model, iphone.model) &&
                Objects.equals(color, iphone.color);
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);
//        Iphone iphone3 = new Iphone("","",null);
        System.out.println(iphone1.equals(iphone2));
    }

}
