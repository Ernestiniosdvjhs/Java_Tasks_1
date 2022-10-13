package com.company;

public class Legs{

    public static void main (String args[]){    //вводим значения параметров
        animals(2, 3, 5);// 36
        animals(1, 2, 3);// 22
        animals(5, 2, 8);// 50
    }

    static void animals(int x, int y, int z){
        System.out.println(x*2+(y+z)*4);    //выводим результат, умножая x на 2, а y и z на 4
    }
}
