package com.company;

public class Ostatok{

    public static void main (String args[]){ //вводим параметры
        remainder(1, 3); // 1
        remainder(3, 4); // 3
        remainder(-9, 45); // -9
        remainder(5, 5); // 0
    }

    static void remainder(int x, int y){
        System.out.println(x % y); //выводим остаток от деления x на y
    }
}
