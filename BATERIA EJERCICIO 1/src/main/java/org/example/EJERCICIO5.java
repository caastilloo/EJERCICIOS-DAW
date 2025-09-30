package org.example;

import java.util.Scanner;

public class EJERCICIO5 {

    static void main(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el DIVIDENDO: ");
        int dividendo = teclado.nextInt();

        System.out.println("Introduzca el DIVISOR: ");
        int divisor = teclado.nextInt();

        if (divisor==0){
            System.out.println("ERROR: no se puede dividir entre 0");

        }else{
            int resultado = dividendo/divisor;
            System.out.println("El resultado es " + resultado);

        }
    }
}
