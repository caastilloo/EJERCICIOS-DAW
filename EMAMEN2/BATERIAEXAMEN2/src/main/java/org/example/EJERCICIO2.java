package org.example;

import java.util.Scanner;

public class EJERCICIO2 {

    static void main() {

        Scanner telcado = new Scanner(System.in);
        int resultado = 0;
        int num_expo = 0;

        System.out.println("Introduczca el número base:");
        int base = telcado.nextInt();

        System.out.println("Introduzca el exponente:");
        int expo = telcado.nextInt();

        if (expo < 0){
            System.out.println("ERROR. El exponente tiene que ser positivo.");
        } else {
            for (int i = 0; i<expo; i++){
                int a=base, b=a;
                a = a*b;
                b=a;
                resultado = a;

            }
        }



        System.out.println(resultado);
        System.out.println("El resultado de la potencia es: ");

    }
}
