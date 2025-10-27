package org.example;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIO3RANDOM {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Introduzca el rango máximo:");
        int max = teclado.nextInt();

        System.out.println("Introduzca el rango mínimo:");
        int min = teclado.nextInt();

        int verificar = aleatorio.nextInt((max - min + 1) + min);

        System.out.println("Cuantos numeros aleatorios quieres:");
        int numero_aleatorios = teclado.nextInt();

        for (int i = 0; i<numero_aleatorios; i++){
            int num = aleatorio.nextInt(max)+1;
            System.out.println(num);

        }

    }
}
