package com.company;

public class Comprasion {

    public static void main (String args[]){    //вводим значения параметров
        operation(24, 15, 9);// "added"
        operation(24, 26, 2);// "subtracted"
        operation(15, 11, 11);// "none"
        operation(28, 4,7);// "multiplied"
        operation(4,28,7);// "divided"
    }

    static void operation(double x, double y, double z){   //вводим несколько условий для проверки
        if ((x-y)==z)   //если x-y = z, то два последних числа должны быть сложены
            System.out.println("added");
        else if ((x-y)==z*(-1)) //если x-y = -z, то два последних числа должны быть вычтены
            System.out.println("subtracted");
        else if ((x/y)==z)  //если x/y = z, то два последних числа должны быть перемножены
            System.out.println("multiplied");
        else if ((x/y)==Math.pow(z, -1))    //если x/y = z^(-1), то два последних числа должны быть поделены
            System.out.println("divided");
        else
            System.out.println("none"); //если предыдущие условия ни к чему не привели, тони одна из операции ничего не даст
    }
}