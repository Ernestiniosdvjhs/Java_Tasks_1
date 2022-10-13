package com.company;

public class Maths {

    public static void main (String args[]){    //вводим значения параметров
        abcmath(5, 2, 1);// true
        abcmath(1, 2, 3);// false
    }

    static void abcmath(double x, double y, double z){
        System.out.println(((x*(Math.pow(2,y)))%z)==0);    //сравниваем остаток от деления X, умноженного на 2 в степени Y, на Z с нулем
    }
}