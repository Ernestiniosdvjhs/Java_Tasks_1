package com.company;

public class ArrayCube {

    public static void main (String args[]){    //вводим значения параметров-массивов
        sumOfCubes(new int[]{3, 4, 5});// 216
        sumOfCubes(new int[]{2});// 8
        sumOfCubes(new int[]{});// 0
    }

    static void sumOfCubes(int[] a){
        int sum = 0;      //создаем переменную sum, в которую будем записывать сумму
        for (int i = 0; i < a.length; i++) {    //перебираем все элементы массива при помощи цикла for
            sum+=Math.pow(a[i],3);      //прибавляем кубы элементов к sum
        }
        System.out.println(sum);
    }
}
