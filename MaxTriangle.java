package com.company;

public class MaxTriangle {

    public static void main (String args[]){    //вводим значения параметров
        nextEdge(8, 10);// 17
        nextEdge(5, 7);// 11
        nextEdge(9, 2);// 10
    }

    static void nextEdge(int x, int y) {
        System.out.println(x+y-1);  //т.к. все значения - целые числа, а сторона треугольника < суммы 2х др.сторон, то максимальная величина c=a+b-1
    }
}