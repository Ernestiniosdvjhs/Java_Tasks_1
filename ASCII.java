package com.company;

public class ASCII {

    public static void main (String args[]){    //вводим значения параметров
        ctoa('A');// 65
        ctoa('m');// 109
        ctoa('[');// 91
        ctoa('/');// 92
    }

    static void ctoa(char x){
        int a = x;  //присваиваем переменную x (char) целочисленной переменной a
        System.out.println(a);   //выводим результат
    }
}