package org.example;

import java.util.Scanner;

public class EJERCICIO3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        int cantidad = 0;
        int suma = 0;

        System.out.println("Introduzca el plan de financiación (meses):");
        int meses = teclado.nextInt();

        for (int i = 1; i<=meses; i++){
            System.out.println("Mes " + i + ":");
            cantidad = teclado.nextInt();

            suma = cantidad+i;
        }


        System.out.println("Total a pagar: " + suma);
    }

}
