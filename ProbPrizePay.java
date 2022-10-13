package com.company;

public class ProbPrizePay {

    public static void main (String args[]){    //вводим значения параметров
        profitableGamble(0.2, 50, 9);// true
        profitableGamble(0.9, 1, 2);// false
    }

    static void profitableGamble(double x, double y, double z){
        System.out.println((y*x)>z);    //выводим результат, сравнивая произведение X и Y c Z
    }
}
