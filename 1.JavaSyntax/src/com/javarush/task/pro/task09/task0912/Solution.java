package com.javarush.task.pro.task09.task0912;
import java.lang.String;
/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        //напишите тут ваш код
        int x=-1;
        x = url.indexOf("https://");
        if ((x>-1) && (x < url.length())) {
 //       System.out.println(x);
        return "https";}
        else 
         x = url.indexOf("http://");
        if ((x>-1) && (x < url.length())) {
 //       System.out.println(x);
        return "http";}
        return "неизвестный";
    }

    public static String checkDomain(String url) {
        //напишите тут ваш код
        int x=-1;
        String result="неизвестный";
        x = url.indexOf(".");
        if ((x>-1) && (x < url.length())) 
        if  (((url.substring(x+1, url.length())).equals("org")) || ((url.substring(x+1, url.length())).equals("com") ||((url.substring(x+1, url.length())).equals("net")) || ((url.substring(x+1, url.length())).equals("ru"))))
        {
         result = url.substring((x+1), url.length());
        }
      
        return result;
    }
}
