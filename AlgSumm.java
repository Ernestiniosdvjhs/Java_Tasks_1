package com.company;

public class AlgSumm {

    public static void main (String args[]){    //вводим значения параметров
        addUpTo(3); // 1 + 2 + 3 = 6
        addUpTo(10); // 1 + 2 + 3 + ... + 10 = 55
        addUpTo(7); // 1 + 2 + 3 + ... + 7 = 28
    }

    static void addUpTo(int x){
        int s = 0;    //создаем переменную s, в которую будем записывать сумму всех значений
        for (int i = 1; i <= x; i++) {      //создаем цикл, перебирающий числа от 1 до x
            s += i;     //прибавляем все числа к переменной s
        }
        System.out.println(s);
    }
}