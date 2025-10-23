package org.example;

import java.util.Scanner;

public class BATERIA2EJERCICIO5 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número de la tabla de multiplicar deseada:");
        int num = teclado.nextInt();

        for (int i = 0; i<11; i++){

            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);

        }

    }

}
