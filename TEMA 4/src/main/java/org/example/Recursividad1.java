package org.example;

public class Recursividad1 {

    static int limite = 10;

    static void main(String[] args) {

        imprimir(1);


    }

    public static void imprimir(int num){

        if (num <= limite){
            System.out.println(num);
            imprimir(num+1);
        }
    }
}
